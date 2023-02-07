package com.luisdev.springboot.todo.app.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luisdev.springboot.todo.app.exceptions.ToDoExceptions;
import com.luisdev.springboot.todo.app.mapper.TaskInDTOtoTask;
import com.luisdev.springboot.todo.app.models.dao.ITaskDao;
import com.luisdev.springboot.todo.app.models.entity.Task;
import com.luisdev.springboot.todo.app.models.entity.TaskStatus;
import com.luisdev.springboot.todo.app.models.service.dto.TaskInDTO;

@Service
public class TaskServiceImpl implements ITaskService {

	@Autowired
	private ITaskDao taskDao;
	
	@Autowired
	private TaskInDTOtoTask mapper;

	@Override
	@Transactional
	public Task createTask(TaskInDTO taskInDTO) {
		
		Task task = mapper.map(taskInDTO);
		return taskDao.save(task);
		
	}

	@Override
	@Transactional(readOnly = true)
	public List<Task> findAll() {
		
		return  (List<Task>) taskDao.findAll();
		
	}

	@Override
	@Transactional(readOnly = true)
	public List<Task> findAllbyTaskStatus(TaskStatus status) {

		return taskDao.findAllByTaskStatus(status);
	}

	@Override
	@Transactional
	public void updateTaskAsFinished(Long id) {
		Task task = null;
		
		task=taskDao.findById(id).orElse(null);
		if (task == null) {
			throw new ToDoExceptions("Task not found", HttpStatus.NOT_FOUND);
		}
		 taskDao.markTaskAsFinished(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Task findById(Long id) {
		// TODO Auto-generated method stub
		return taskDao.getReferenceById(id);
	}





}

