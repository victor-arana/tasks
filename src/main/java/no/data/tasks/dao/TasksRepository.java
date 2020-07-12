package no.data.tasks.dao;

import no.data.tasks.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TasksRepository extends JpaRepository<Task, Long> {
}
