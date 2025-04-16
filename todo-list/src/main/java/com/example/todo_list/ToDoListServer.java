package com.example.todo_list;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ToDoListServer {

    @Autowired
    private TodolistRepository todolistRepository;
    private ToDoListes toDoListes;

    public List<ToDoListes> getAllTodoList() {
        return todolistRepository.findAll();
    }

    public void insertToDoListes(ToDoListes toDoListes) {
        todolistRepository.save(toDoListes);
    }

    public ToDoListes getToDoListById(Integer id) {

        return todolistRepository.findById(id)
                .orElseThrow(()->new IllegalStateException(id + "not found"));
    }
}
