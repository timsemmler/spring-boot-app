package de.rossmann.prodigi.einstelltest.tasklist.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<TaskEntity, Long> {
    List<TaskEntity> findAllByTaskList(TaskListEntity taskListEntity);
}
