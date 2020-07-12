package no.data.tasks.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import no.data.tasks.entity.enums.TaskCategory;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDateTime start;

    private LocalDateTime finish;

    @Enumerated(EnumType.STRING)
    private TaskCategory taskCategory;

    private String description;
}
