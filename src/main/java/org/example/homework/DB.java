package org.example.homework;

import java.util.ArrayList;
import java.util.List;

public interface DB {

    List<User> USERS = new ArrayList<>(List.of(
            new User(1, "Eshmat", "eshmat", "000"),
            new User(2, "Toshmat", "toshmat", "111"),
            new User(3, "Hikmat", "hikmat", "222")
    ));

    List<Tasks> TASKS = new ArrayList<>(List.of(
            new Tasks(1, "Task1", Status.NEW),
            new Tasks(3, "Task3", Status.NEW),
            new Tasks(2, "Task2", Status.NEW),
            new Tasks(4, "Task4", Status.NEW),
            new Tasks(5, "Task5", Status.NEW),
            new Tasks(6, "Task6", Status.NEW),
            new Tasks(7, "Task7", Status.NEW),
            new Tasks(8, "Task8", Status.NEW),
            new Tasks(9, "Task9", Status.NEW),
            new Tasks(10, "Task10", Status.NEW),
            new Tasks(11, "Task11", Status.IN_PROGRESS),
            new Tasks(12, "Task12", Status.IN_PROGRESS),
            new Tasks(13, "Task13", Status.IN_PROGRESS),
            new Tasks(14, "Task14", Status.IN_PROGRESS),
            new Tasks(15, "Task15", Status.IN_PROGRESS),
            new Tasks(16, "Task16", Status.IN_PROGRESS),
            new Tasks(17, "Task17", Status.IN_PROGRESS),
            new Tasks(18, "Task18", Status.IN_PROGRESS),
            new Tasks(19, "Task19", Status.IN_PROGRESS),
            new Tasks(20, "Task20", Status.IN_PROGRESS),
            new Tasks(21, "Task21", Status.COMPLETED),
            new Tasks(22, "Task22", Status.COMPLETED),
            new Tasks(23, "Task23", Status.COMPLETED),
            new Tasks(24, "Task24", Status.COMPLETED),
            new Tasks(25, "Task25", Status.COMPLETED),
            new Tasks(26, "Task26", Status.COMPLETED),
            new Tasks(27, "Task27", Status.COMPLETED),
            new Tasks(28, "Task28", Status.COMPLETED),
            new Tasks(29, "Task29", Status.COMPLETED),
            new Tasks(30, "Task30", Status.COMPLETED)
    ));


}
