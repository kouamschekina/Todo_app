package com.schekina.ToDo_app;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.schekina.ToDo_app.domain.Todo;
import com.schekina.ToDo_app.repo.TodoRepository;
import com.schekina.ToDo_app.service.TodoService;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class TodoServiceTest {

    @Mock
    private TodoRepository todoRepository;

    @InjectMocks
    private TodoService todoService;

    @Test
    public void TestAddTodo(){
        Todo todo = new Todo(null, null);
        todo.setName("test todo");

        when(todoRepository.save(any(Todo.class))).thenReturn(todo);
        Todo savedTodo = todoService.addTodo(todo);

        assertNotNull(savedTodo);
        assertEquals("test todo", savedTodo.getName());

        verify(todoRepository, times(1)).save(any(Todo.class));
    }
    
}
