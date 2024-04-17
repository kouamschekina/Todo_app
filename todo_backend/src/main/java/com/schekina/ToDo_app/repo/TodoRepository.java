package com.schekina.ToDo_app.repo;

import com.schekina.ToDo_app.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository  extends JpaRepository<Todo, Long> {
    
}
