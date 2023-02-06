package com.luisdev.springboot.todo.app.mapper;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import com.luisdev.springboot.todo.app.models.entity.Task;
import com.luisdev.springboot.todo.app.models.entity.TaskStatus;
import com.luisdev.springboot.todo.app.models.service.dto.TaskInDTO;

@Component
public class TaskInDTOtoTask implements IMapper<TaskInDTO, Task> {
	
	@Override
	public Task map(TaskInDTO in) {
		
		Task task = new Task();
		
		task.setTitle(in.getTitle());
		task.setDescription(in.getDescription());
		task.setEta(in.getEta());
		task.setCreateAt(LocalDateTime.now());
		task.setFinished(false);
		task.setTaskstatus(TaskStatus.ON_TIME);
		return task;
	}

}
