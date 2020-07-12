package no.data.tasks.controller;

import no.data.tasks.entity.Task;
import org.apache.tomcat.jni.Local;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TasksController {

    @GetMapping("/tasks/")
    public List<Task> getTasks(){
        Task firstTask = new Task();
        firstTask.setStart(LocalDateTime.now());
        firstTask.setStart(LocalDateTime.now().plusMinutes(30L));

        List<Task> tasks = new ArrayList<>();
        tasks.add(firstTask);

        return tasks;
    }
}
