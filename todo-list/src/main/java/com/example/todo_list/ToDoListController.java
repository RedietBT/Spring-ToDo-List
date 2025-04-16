package com.example.todo_list;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/toDoList")
public class ToDoListController {

    private final ToDoListServer toDoListServer;

    public ToDoListController(ToDoListServer toDoListServer) {
        this.toDoListServer = toDoListServer;
    }

    @GetMapping
    public List<ToDoListes> getAllTodoList(){
        return toDoListServer.getAllTodoList();
    }

    @GetMapping("{id}")
    public ToDoListes getToDoListById(@PathVariable Integer id){
        return toDoListServer.getToDoListById(id);
    }

    @PostMapping
    public void insertToDoListes(@RequestBody ToDoListes toDoListes){
        toDoListServer.insertToDoListes(toDoListes);
    }

    @PutMapping("{id}")
    public void updateToDoListById(@PathVariable Integer id, @RequestBody ToDoListes toDoListes){
        toDoListServer.updateToDoListById(id, toDoListes);
    }
}
