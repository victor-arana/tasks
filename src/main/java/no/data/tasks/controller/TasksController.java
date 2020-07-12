package no.data.tasks.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TasksController {

    @GetMapping("/tasks/")
    public String getTasks(){
        return "tasks";
    }
}
