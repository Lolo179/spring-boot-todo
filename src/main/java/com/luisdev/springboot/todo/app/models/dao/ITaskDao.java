package com.luisdev.springboot.todo.app.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.luisdev.springboot.todo.app.models.entity.Task;
import com.luisdev.springboot.todo.app.models.entity.TaskStatus;

public interface ITaskDao extends CrudRepository<Task, Long>, JpaRepository<Task, Long>{
	
	public List<Task> findAllByTaskStatus(TaskStatus status);
}
