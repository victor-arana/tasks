package no.data.tasks.controller;

import no.data.tasks.dao.TasksRepository;
import no.data.tasks.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TasksController {

    @Autowired
    private TasksRepository repository;

    @GetMapping("/tasks/")
    public List<Task> getTasks(){
        List<Task> tasks = repository.findAll();
        return tasks;
    }
}
