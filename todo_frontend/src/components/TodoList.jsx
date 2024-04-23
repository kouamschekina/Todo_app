import React, {UseEffect, useState} from 'react';


function TodoList(){
    const [todos, setTodos] = useState([]);

    const addTodo = (todo) => {
        setTodos([...todos, todo]);
    }

    const removeTodo = (todo) => {
        setTodos(todos.filter(t => t!== todo));
    }

    return (
        <div className="todo-list">
            {todos.map((todo, index) => (
                <div key={index} className="todo-item">
                    <input type="checkbox" checked={todo} onChange={() => removeTodo(todo)} />
                    {todo}
                </div>
            ))}
            <input type="text" onChange={(e) => addTodo(e.target.value)} />
        </div>
    )
}

export default TodoList;