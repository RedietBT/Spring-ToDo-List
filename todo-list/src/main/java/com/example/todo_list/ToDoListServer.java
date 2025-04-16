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

    public void updateToDoListById(Integer id, ToDoListes updates) {
       ToDoListes toDoListes = todolistRepository.findById(id)
               .orElseThrow(()->new IllegalStateException(id + "not found"));
       toDoListes.setTask_owners_name(updates.getTask_owners_name());
        toDoListes.setTask_name(updates.getTask_name());
        todolistRepository.save(toDoListes);
    }
}
