import 'bootstrap/dist/css/bootstrap.min.css';
import React , {useState} from 'react';
import TodoForm from './components/TodoForm';

function App(){
  const [TodoList, setTodos] = useState([]);

  const handleNewTodo = (newtodo) => {
    setTodos([...TodoList, newtodo]);
  };

  return (
    <div className="App">
      <header className="App-header">
        <h1 className="App-title">TodoList</h1>
      </header>
      <TodoForm onNewTodo={handleNewTodo} />
      <table className="table mt-3">
        <thead>
          <tr>
            <th>ID</th>
            <th>Name</th>
          </tr>
        </thead>
        <tbody>
          {TodoList.map((todo, index) => (
            <tr key={index}>
              <td>{todo.id}</td>
              <td>{todo.name}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default App;