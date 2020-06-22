package com.example.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.model.SchoolTask;
import com.example.repository.SchoolTaskRepository;

@Service("schoolTaskService")
@EnableTransactionManagement
@EnableAutoConfiguration
public class SchoolTaskServiceImpl implements SchoolTaskService {
	 private SchoolTaskRepository schoolTaskRepository;
	    @Autowired
	    public SchoolTaskServiceImpl(SchoolTaskRepository schoolTaskRepository) {
	        this.schoolTaskRepository = schoolTaskRepository;
	    }
	    @Override
	    @Transactional
	    public Iterable<SchoolTask> findAllSchoolTasks() {
	        return schoolTaskRepository.findAll();
	    }
	    @Override
	    public Optional<SchoolTask> findSchoolTaskById(int Id) {
	        return schoolTaskRepository.findById(Id);
	    }

	    @Override
	    public SchoolTask createAndUpdateSchoolTask(SchoolTask schoolTask) {
	        return schoolTaskRepository.save(schoolTask);
	    }

	    @Override
	    public void deleteSchoolTaskById(int Id) {
	        schoolTaskRepository.deleteById(Id);

	    }


}
