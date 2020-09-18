package no.data.tasks.exception;

public class TaskNotFoundException extends RuntimeException {
    public TaskNotFoundException(Long id) {
        super("Could not found task with id: " + id);
    }
}
