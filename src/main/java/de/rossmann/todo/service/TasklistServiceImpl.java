package de.rossmann.todo.service;

import de.rossmann.todo.domain.Tasklist;
import de.rossmann.todo.domain.TasklistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TasklistServiceImpl implements TasklistService {

    private TasklistRepository tasklistRepository;

    public TasklistServiceImpl(TasklistRepository tasklistRepository) {
        this.tasklistRepository = tasklistRepository;
    }

    @Override
    public List<Tasklist> findAll() {
        return tasklistRepository.findAll();
    }

    @Override
    public Optional<Tasklist> findSingleById(Long id) {
        return tasklistRepository.findById(id);
    }

}
