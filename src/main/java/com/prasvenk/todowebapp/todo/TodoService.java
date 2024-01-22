package com.prasvenk.todowebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
		
	private static List<Todo> todos = new ArrayList<>();
	
	private static int todocount =0;
	
	static {
		todos.add(new Todo(++todocount, "Prasanna", "Learn Spring boot", LocalDate.now().plusMonths(3), false));
		todos.add(new Todo(++todocount, "Prasanna", "Learn Amazon selling", LocalDate.now().plusMonths(3), false));
		todos.add(new Todo(++todocount, "Prasanna", "Learn to play Mridangam soon", LocalDate.now().plusMonths(6), false));
	}
	
	public List<Todo> findByName(String username){
		return todos;
	}

	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		Todo todo = new Todo(++todocount, username, description, targetDate, done);
		todos.add(todo);
		
	}

}
