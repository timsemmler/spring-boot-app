package de.rossmann.todo.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TasklistRepository extends JpaRepository<Tasklist, Long> {
}
