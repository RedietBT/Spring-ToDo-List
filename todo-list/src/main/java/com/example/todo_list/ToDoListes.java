package com.example.todo_list;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class ToDoListes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  private   Integer id;
  private   String task_owners_name;
  private   String task_name;
  private   String task_submition_date;

    public ToDoListes() {
    }

    public ToDoListes(Integer id, String task_owners_name, String task_name, String task_submition_date) {
        this.id = id;
        this.task_owners_name = task_owners_name;
        this.task_name = task_name;
        this.task_submition_date = task_submition_date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTask_owners_name() {
        return task_owners_name;
    }

    public void setTask_owners_name(String task_owners_name) {
        this.task_owners_name = task_owners_name;
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public String getTask_submition_date() {
        return task_submition_date;
    }

    public void setTask_submition_date(String task_submition_date) {
        this.task_submition_date = task_submition_date;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ToDoListes that = (ToDoListes) o;
        return Objects.equals(id, that.id) && Objects.equals(task_owners_name, that.task_owners_name) && Objects.equals(task_name, that.task_name) && Objects.equals(task_submition_date, that.task_submition_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, task_owners_name, task_name, task_submition_date);
    }
}
