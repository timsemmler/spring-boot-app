package de.rossmann.prodigi.einstelltest.tasklist.domain;

import de.rossmann.prodigi.einstelltest.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskListEntityRepository extends JpaRepository<TaskListEntity, Long> {

    List<TaskListEntity> findAllByUser(UserEntity user);
}
