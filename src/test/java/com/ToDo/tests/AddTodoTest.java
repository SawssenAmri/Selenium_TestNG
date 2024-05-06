package com.Todo.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.todo.page.TodoPage;
import com.todo.utils.Setup;

public class AddTodoTest extends Setup {

	public AddTodoTest() throws IOException {
		super();
	}

	TodoPage todoPage;
	
	@Test
	public void iCanAddTodo() throws IOException {
		todoPage = new TodoPage();
		todoPage.submitTodo(prop.getProperty("todo1"));
	}
}
