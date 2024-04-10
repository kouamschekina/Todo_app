package com.schekina.ToDo_app;

import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import com.schekina.ToDo_app.controller.TodoController;
import com.schekina.ToDo_app.domain.Todo;
import com.schekina.ToDo_app.service.TodoService;

@WebMvcTest(TodoController.class)
public class TodoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TodoService todoService;
    
    @Test
    public void testGetAllTodos() throws Exception {
        Todo todo1 = new Todo("Test Todo 1", null);
        Todo todo2 = new Todo("Test Todo 2", null);
        List<Todo> todos = Arrays.asList(todo1, todo2);

        when(todoService.getAllTodos()).thenReturn(todos);

        mockMvc.perform(get("/todos"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$[0].title").value("Test Todo 1"))
        .andExpect(jsonPath("$[1].title").value("Test Todo 2"));

    }

}
