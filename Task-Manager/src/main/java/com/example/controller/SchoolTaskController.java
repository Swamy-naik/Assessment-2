package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.model.SchoolTask;
import com.example.service.SchoolTaskService;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SchoolTaskController {
    private SchoolTaskService schoolTaskService;
@Autowired
    public SchoolTaskController(SchoolTaskService schoolTaskService) {
        this.schoolTaskService = schoolTaskService;
    }
    @GetMapping(value = {"/schoolTasks"},produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Iterable<SchoolTask>> getAllSchoolTasks()
    {
        return ResponseEntity.status(HttpStatus.OK).body(schoolTaskService.findAllSchoolTasks());
    }
    @GetMapping(value = "/schoolTasks/{schoolTaskId}",produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Optional<SchoolTask>> getHomeTasksById(@PathVariable("schoolTaskId") int Id){
        return ResponseEntity.status(HttpStatus.OK).body(schoolTaskService.findSchoolTaskById(Id));
    }
    @PostMapping("/schoolTasks")
    public ResponseEntity<SchoolTask> createSchoolTask(@Valid @RequestBody SchoolTask schoolTask)
    {

        return ResponseEntity.status(HttpStatus.OK).body(schoolTaskService.createAndUpdateSchoolTask(schoolTask));
    }
    @PutMapping("/schoolTasks")
    public ResponseEntity<SchoolTask> updateSchoolTask(@Valid @RequestBody SchoolTask schoolTask)
    {
        return ResponseEntity.status(HttpStatus.OK).body(schoolTaskService.createAndUpdateSchoolTask(schoolTask));
    }
    @DeleteMapping("/schoolTasks/{taskId}")
    public ResponseEntity<String> deleteSchoolTaskById(@PathVariable("taskId") int Id)
    {
        schoolTaskService.deleteSchoolTaskById(Id);
        return ResponseEntity.status(HttpStatus.OK).body("deleted successfully");
    }
}