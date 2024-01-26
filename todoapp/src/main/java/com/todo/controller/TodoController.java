package com.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.todo.entity.Todo;
import com.todo.mapper.TodoMapper;

@Controller
public class TodoController {
	
	@Autowired
	TodoMapper todoMapper;
	
	@RequestMapping(value="/")
	public String index(Model model) {
		List<Todo> list = todoMapper.selectAll();
		model.addAttribute("todos", list);
		return "index";
	}

}