package de.rossmann.prodigi.einstelltest.tasklist.service;

import de.rossmann.prodigi.einstelltest.tasklist.domain.TaskEntity;
import de.rossmann.prodigi.einstelltest.tasklist.domain.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;

    @Override
    public TaskEntity save(TaskEntity entity) {
        return taskRepository.save(entity);
    }

    @Override
    public void delete(Long id) {
        taskRepository.deleteById(id);
    }
}
