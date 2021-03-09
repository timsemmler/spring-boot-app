package de.rossmann.prodigi.einstelltest.tasklist.controller;

import de.rossmann.prodigi.einstelltest.tasklist.domain.TaskListEntity;
import de.rossmann.prodigi.einstelltest.tasklist.service.TaskListService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping(path = "/tasklist")
@RequiredArgsConstructor
public class TaskListController {
    private final TaskListService taskListService;

    @RequestMapping(path = "/{username}", method = RequestMethod.GET)
    public List<TaskListEntity> loadListByUsername(@PathVariable(name = "username") String username) {
        return taskListService.loadAllTaskList(username);
    }

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public ResponseEntity<Void> createNewList(@RequestBody TaskListEntity taskListEntity, UriComponentsBuilder uriComponentsBuilder) {
        TaskListEntity entity = taskListService.save(taskListEntity);
        HttpHeaders responseHeaders = new HttpHeaders();
        UriComponents uriComponents = uriComponentsBuilder.path("/tasklist/{id}").buildAndExpand(entity.getId());
        responseHeaders.setLocation(uriComponents.toUri());
        return ResponseEntity.ok().headers(responseHeaders).build();
    }
}
