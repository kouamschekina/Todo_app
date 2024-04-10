package com.schekina.ToDo_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.schekina.ToDo_app.domain.Todo;
import com.schekina.ToDo_app.service.TodoService;

@RestController
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping("/todos")
    public List<Todo> getAllTodos(){
        return todoService.getAllTodos();
    }

    @PostMapping("/todos")
    public Todo addTodo(@RequestBody Todo todo){
        return todoService.addTodo(todo);
    }
    @DeleteMapping("/todos")
    public ResponseEntity<Void> deleteTodo(@RequestBody Todo todo){
        todoService.deleteTodo(todo);
        return ResponseEntity.ok().build();
    }
}
