package com.example.todo_list;


import org.springframework.data.jpa.repository.JpaRepository;

public interface TodolistRepository extends JpaRepository<ToDoListes, Integer> {

}
