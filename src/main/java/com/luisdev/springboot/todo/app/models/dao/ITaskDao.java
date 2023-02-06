package com.luisdev.springboot.todo.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.luisdev.springboot.todo.app.models.entity.Task;
import com.luisdev.springboot.todo.app.models.service.dto.TaskInDTO;

public interface ITaskDao extends CrudRepository<Task, Long>{
	
}
