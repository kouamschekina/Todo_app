import React from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import App from './App';
import TodoList from './TodoList';

function Root(){
    return(
        <Router>
            <Switch>
                <Route exact path="/">
                    <App />
                </Route>
                <Route path="/todos">
                    <TodoList />
                </Route>
            </Switch>
        </Router>
    )
}

export default Root;