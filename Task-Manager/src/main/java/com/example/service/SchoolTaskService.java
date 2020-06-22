package com.example.service;

import java.util.Optional;

import com.example.model.SchoolTask;

public interface SchoolTaskService {
    public Iterable<SchoolTask> findAllSchoolTasks();
    public Optional<SchoolTask> findSchoolTaskById(int Id);
    public SchoolTask createAndUpdateSchoolTask(SchoolTask schoolTask);

    public void deleteSchoolTaskById(int Id);
}