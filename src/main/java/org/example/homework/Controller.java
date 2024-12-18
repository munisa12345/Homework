package org.example.homework;

import jakarta.servlet.http.HttpSession;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {

    public static User currentUser;

    @GetMapping("/loginPage")
    public String loginPage(){
        return "LoginPage";
    }

    @PostMapping("/login")
    public String login(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session){
        for (User user : DB.USERS) {
            if(user.getEmail().equals(email) && user.getPassword().equals(password)){
                currentUser = user;
                session.setAttribute("currentUser", currentUser);
                model.addAttribute("tasks", DB.TASKS);
                return "tasks";
            }
        }
        return "LoginPage";
    }

    @GetMapping("/tasks")
    public String getTasks(Model model) {
        model.addAttribute("tasks", DB.TASKS);
        return "tasks";
    }


    @PostMapping("/checkStatus")
    public String post(@RequestParam(name = "id") String id){
        int idParse = Integer.parseInt(id);

        Tasks tasks = DB.TASKS.stream()
                .filter(item -> item.getId() == idParse)
                .findFirst()
                .orElse(null);

       if (tasks.getStatus().equals(Status.NEW)){
           tasks.setStatus(Status.IN_PROGRESS);
       } else if (tasks.getStatus().equals(Status.IN_PROGRESS)) {
           tasks.setStatus(Status.COMPLETED);
       }else if (tasks.getStatus().equals(Status.COMPLETED)){
           tasks.setStatus(Status.ARCHIVE);
       }
        return "redirect:/tasks";
    }

}
