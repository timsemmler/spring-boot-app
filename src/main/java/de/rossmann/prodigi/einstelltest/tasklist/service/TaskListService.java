package de.rossmann.prodigi.einstelltest.tasklist.service;

import de.rossmann.prodigi.einstelltest.tasklist.domain.TaskListEntity;

import java.util.List;

public interface TaskListService {
    List<TaskListEntity> loadAllTaskList(String username);

    TaskListEntity save(TaskListEntity entity);

    void delete(Long id);
}
