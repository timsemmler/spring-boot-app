package de.rossmann.prodigi.einstelltest.tasklist.service;

import de.rossmann.prodigi.einstelltest.tasklist.domain.TaskListEntity;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
@Slf4j
@ComponentScan("de.rossmann.prodigi.einstelltest")
public class TaskListServiceImplIT {

    @Autowired
    private TaskListService taskListService;
    @Test
    public void loadAllTaskList() {
        List<TaskListEntity> taskListEntities = taskListService.loadAllTaskList("oliver.weichert");
        Assertions.assertThat(taskListEntities).hasSize(1);
        Assertions.assertThat(taskListEntities.get(0).getName()).isEqualTo("Einkaufsliste");
    }
}