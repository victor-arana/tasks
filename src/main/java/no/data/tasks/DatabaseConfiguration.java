package no.data.tasks;

import no.data.tasks.dao.TasksRepository;
import no.data.tasks.entity.Task;
import no.data.tasks.entity.enums.TaskCategory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class DatabaseConfiguration {

    @Bean
    CommandLineRunner initDatabase(TasksRepository repository){
        return args -> {
            Task task = new Task();
            task.setTaskCategory(TaskCategory.WORK);
            task.setDescription("Mobile app");
            task.setStart(LocalDateTime.now());
            task.setFinish(LocalDateTime.now().plusMinutes(30L));
            repository.save(task);
        };
    }
}
