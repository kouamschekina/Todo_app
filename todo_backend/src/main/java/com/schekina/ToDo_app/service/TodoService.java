package com.schekina.ToDo_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schekina.ToDo_app.domain.Todo;
import com.schekina.ToDo_app.repo.TodoRepository;

import java.security.Provider;
import java.util.List;

@Service
public class TodoService {
    // TODO create an instance of the repository interface  for eg Private TodoRepository todoRepository;

    @Autowired
    private TodoRepository todoRepository;

    //TODO create methods to retrieve todo, delete , add and update todos

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public Todo addTodo(Todo todo){
        return todoRepository.save(todo);
    }

    public Todo updateTodo(Todo todo){
        return todoRepository.save(todo);

    }

    public void deleteTodo(Todo todo){
        todoRepository.delete(todo);
    }




}
