package com.luisdev.springboot.todo.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luisdev.springboot.todo.app.models.entity.Task;
import com.luisdev.springboot.todo.app.models.entity.TaskStatus;
import com.luisdev.springboot.todo.app.models.service.ITaskService;
import com.luisdev.springboot.todo.app.models.service.dto.TaskInDTO;

@RestController
@RequestMapping("/tasks")
public class TaskController {
	
	@Autowired
	private ITaskService taskService;
	
	@PostMapping
	public Task createTask(@RequestBody TaskInDTO taskInDTO) {
		return taskService.createTask(taskInDTO);
	}
	
	@GetMapping
	public List<Task> findAll(){
		return taskService.findAll();
	}

	@GetMapping("/status/{status}")
	public List<Task> findAllbyStatus(@PathVariable("status")TaskStatus status){
		return taskService.findAllbyTaskStatus(status);
	}
}
