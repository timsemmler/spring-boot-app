package de.rossmann.prodigi.einstelltest.tasklist.service;

import de.rossmann.prodigi.einstelltest.tasklist.domain.TaskListEntity;
import de.rossmann.prodigi.einstelltest.tasklist.domain.TaskListEntityRepository;
import de.rossmann.prodigi.einstelltest.user.UserEntity;
import de.rossmann.prodigi.einstelltest.user.UserRepository;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.Optional;

import static org.mockito.Mockito.*;

public class TaskListServiceImplTest {

    @Mock
    private TaskListEntityRepository taskListEntityRepository;
    @Mock
    private UserRepository userRepository;
    @InjectMocks
    private TaskListServiceImpl service;

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Test
    public void loadAllTaskList() {
        String testuser = "testuser";
        UserEntity userEntity = mock(UserEntity.class);
        when(userRepository.findById(testuser)).thenReturn(Optional.of(userEntity));
        service.loadAllTaskList(testuser);
        verify(taskListEntityRepository).findAllByUser(userEntity);
    }

    @Test
    public void save() {
        service.save(new TaskListEntity());
        verify(taskListEntityRepository).save(any());
    }

    @Test
    public void delete() {
        service.delete(1L);
        verify(taskListEntityRepository).deleteById(1L);
    }
}