package com.schekina.ToDo_app.domain;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Todo list")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // TODO create getters and setters or you can use the lombok also set the table name

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    @NotNull
    private String name;

    public Todo(String name, Long id) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("TodoList={id='%d', name='%s'}",id ,name);
    }

}
