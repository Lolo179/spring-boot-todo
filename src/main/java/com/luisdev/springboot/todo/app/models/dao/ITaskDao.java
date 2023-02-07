package com.luisdev.springboot.todo.app.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.luisdev.springboot.todo.app.models.entity.Task;
import com.luisdev.springboot.todo.app.models.entity.TaskStatus;

public interface ITaskDao extends JpaRepository<Task, Long>{
	
	public List<Task> findAllByTaskStatus(TaskStatus status);
	
	@Modifying
	@Query(value="UPDATE task SET FINISHED=TRUE WHERE id=:id",nativeQuery = true)
	public  void markTaskAsFinished(@Param("id")Long id);
}
