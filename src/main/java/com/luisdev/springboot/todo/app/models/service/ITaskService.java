package com.luisdev.springboot.todo.app.models.service;

import java.util.List;
import java.util.Optional;

import com.luisdev.springboot.todo.app.models.entity.Task;
import com.luisdev.springboot.todo.app.models.entity.TaskStatus;
import com.luisdev.springboot.todo.app.models.service.dto.TaskInDTO;

public interface ITaskService {
	
	public Task createTask(TaskInDTO taskInDTO);
	
	public List<Task> findAll();
	
	public List<Task> findAllbyTaskStatus(TaskStatus status);
	
	public void updateTaskAsFinished(Long id);
	
	public Task findById(Long id);

}
