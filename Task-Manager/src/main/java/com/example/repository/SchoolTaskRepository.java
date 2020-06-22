package com.example.repository;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.model.SchoolTask;

@Repository
@EnableAutoConfiguration
@EnableTransactionManagement
public interface SchoolTaskRepository extends CrudRepository<SchoolTask,Integer> {
}