package com.todo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.todo.entity.Todo;

@Mapper
public interface TodoMapper {
	
	public List<Todo> selectAll();

}