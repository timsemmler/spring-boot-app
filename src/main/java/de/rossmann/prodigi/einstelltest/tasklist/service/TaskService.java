package de.rossmann.prodigi.einstelltest.tasklist.service;

import de.rossmann.prodigi.einstelltest.tasklist.domain.TaskEntity;

public interface TaskService {

    TaskEntity save(TaskEntity entity);

    void delete(Long id);
}
