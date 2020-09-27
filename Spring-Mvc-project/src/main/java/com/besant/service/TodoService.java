package com.besant.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.besant.model.Todo;

@Service 
public class TodoService {
	
	private static List<Todo> todos = new ArrayList<Todo>();
	private static int todoCount = 3;
	
	
	static {
		todos.add(new Todo(1, "besant", "Learn Spring MVC", new Date(),false));
		todos.add(new Todo(2, "besant", "Learn Struts", new Date(), false));
		todos.add(new Todo(3, "besant", "Learn Hibernate", new Date(),false));
		todos.add(new Todo(3, "besant123", "Learn Hibernate", new Date(),false));
	}
	
	public List<Todo> retrieveTodos() {
		/*
		 * List<Todo> filteredTodos = new ArrayList<Todo>(); for (Todo todo : todos) {
		 * if (todo.getUser().equals(user)) filteredTodos.add(todo); }
		 */
		return todos;
	}
	
	
	public void addTodo(String name, String desc, Date targetDate,
			boolean isDone) {
		todos.add(new Todo(++todoCount, name, desc, targetDate, isDone));
	}

}
