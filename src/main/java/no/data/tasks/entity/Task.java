package no.data.tasks.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import no.data.tasks.entity.enums.TaskCategory;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class Task {
    private LocalDateTime start;
    private LocalDateTime finish;
    private TaskCategory taskCategory;
    private String description;
}
