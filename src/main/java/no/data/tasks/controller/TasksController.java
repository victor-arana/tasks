package no.data.tasks.controller;

import no.data.tasks.dao.TasksRepository;
import no.data.tasks.entity.Task;
import no.data.tasks.exception.TaskNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TasksController {

    @Autowired
    private TasksRepository repository;

    @GetMapping("/tasks")
    public List<Task> getTasks(){
        List<Task> tasks = repository.findAll();
        return tasks;
    }

    @PostMapping("/tasks")
    public Task createTask(@RequestBody Task task) {
        return repository.save(task);
    }

    @GetMapping("/tasks/{id}")
    public Task getTask(@PathVariable Long id){

        return repository.findById(id).orElseThrow(() -> new TaskNotFoundException(id));
    }


}
