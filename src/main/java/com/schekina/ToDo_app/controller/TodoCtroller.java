package com.schekina.ToDo_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.schekina.ToDo_app.service.TodoService;

@RestController
public class TodoCtroller {
    @Autowired
    private TodoService todoService;
    // TODO create an instance of the service class  for eg Private TodoService todoService;
}
