
package com.example.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

import com.example.todo.service.TodoH2Service;
import com.example.todo.model.Todo;

@RestController

public class TodoController {

    @Autowired

    public TodoH2Service todoService;

    @GetMapping("/todos")

    public ArrayList<Todo> getTodos() {
        return todoService.getTodos();
    }

    @GetMapping("/todos/{todoId}")

    public Todo getTodoById(@PathVariable("/todoId") int todoId) {
        return todoService.getTodoById(todoId);

    }

    @PostMapping("/todos")

    public Todo addTodo(@RequestBody Todo todo) {
        return todoService.addTodo(todo);
    }

    @PutMapping("/todos/{todoId}")

    public Todo updateTodo(@PathVariable("todoId") int todoId, @RequestBody Todo todo) {
        return todoService.updateTodo(todoId, todo);
    }

    @DeleteMapping("/todos/{todoId}")

    public void deleteTodo(@PathVariable int todoId) {
        todoService.deleteTodo(todoId);
    }

}
