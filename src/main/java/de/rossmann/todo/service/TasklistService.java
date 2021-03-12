package de.rossmann.todo.service;


import de.rossmann.todo.domain.Tasklist;

import java.util.List;
import java.util.Optional;

public interface TasklistService {

    List<Tasklist> findAll();

    Optional<Tasklist> findByIdAll(Long id);
}
