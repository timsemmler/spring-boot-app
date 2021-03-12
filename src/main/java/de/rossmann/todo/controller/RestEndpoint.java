package de.rossmann.todo.controller;

import de.rossmann.todo.domain.Tasklist;
import de.rossmann.todo.service.TasklistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@RestController
public class RestEndpoint {

    private TasklistService tasklistService;

    public RestEndpoint(TasklistService tasklistService) {
        this.tasklistService = tasklistService;
    }

    @GetMapping("tasklists")
    public ResponseEntity<List<Tasklist>> getTasklists() {
        return ResponseEntity.ok(tasklistService.findAll());
    }

    @GetMapping("tasklist/{id}")
    public ResponseEntity<Tasklist> getSingleTasklist(@PathParam("id") long id) {
        Optional<Tasklist> tasklist = tasklistService.findByIdAll(id);
        return tasklist.map(ResponseEntity::ok).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));

    }
}