import React, {useState} from 'react';

function TodoForm(){
    const [todos, setTodos] = useState({name: ''});
    const handleSubmit = (event) => {
        event.preventDefault();
        if (!todos.name.trim()){
            alert('Please enter a task name!');
            return;
        }
        fetch('http://localhost:8080/api/todos', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(todos)

    })
    .then(response => {
        if(!response.ok){
            throw new Error(response.statusText);
        }
    return response.json();
    })
    .then(data => {
        console.log("Todo created: ", data);
        alert('Todo successfully added');
    })
    .catch(err =>{
        console.error("Error creating Todo: ", err)
        alert('Error creating Todo. Please try again');
    })
    };

    const handleChange = (event) => {
        const {name, value} = event.target;
        setTodos({...todos, [event.target.name]: event.target.value});
    };

    return (
        <form onSubmit={handleSubmit} style={{display: 'flex', flexDirection: 'column', gap: '10px '}} className="p-3">
            <div>
                <label htmlFor="name" className='form-label'>Name</label>
                <input
                    type="text"
                    name="name"
                    value={todos.name}
                    onChange={handleChange}
                    placeholder="Name"
                />
            </div>
            <button type="submit" className='btn btn-primary btn-sm'>Add Todo</button>
        </form>
    );
}

export default TodoForm;