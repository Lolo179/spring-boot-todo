package com.luisdev.springboot.todo.app.mapper;

public interface IMapper<I, O> {
	public O map(I in);
}
