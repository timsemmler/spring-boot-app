package de.rossmann.prodigi.einstelltest.tasklist.service;

import de.rossmann.prodigi.einstelltest.tasklist.domain.TaskListEntity;
import de.rossmann.prodigi.einstelltest.tasklist.domain.TaskListEntityRepository;
import de.rossmann.prodigi.einstelltest.user.UserEntity;
import de.rossmann.prodigi.einstelltest.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TaskListServiceImpl implements TaskListService {

    private final TaskListEntityRepository taskListEntityRepository;

    private final UserRepository userRepository;

    @Override
    public List<TaskListEntity> loadAllTaskList(String username) {
        Optional<UserEntity> optionalUserEntity = userRepository.findById(username);
        return optionalUserEntity.map(taskListEntityRepository::findAllByUser).orElse(null);
    }

    @Override
    public TaskListEntity save(TaskListEntity entity) {
        return taskListEntityRepository.save(entity);
    }

    @Override
    public void delete(Long id) {
        taskListEntityRepository.deleteById(id);
    }
}
