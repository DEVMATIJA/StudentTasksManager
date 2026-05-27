package com.example.StudentTaskManager.service;

import com.example.StudentTaskManager.model.Task;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    private List<Task> tasks = new ArrayList<>();

    @PostConstruct
    public void init(){

        tasks.add(new Task(
                1L,
                "Finish Spring project",
                "Complete MVC application",
                false
        ));

        tasks.add(new Task(
           2L,
           "Study Thymeleaf",
           "Learn Template engine basics",
           true
        ));
    }

    public List<Task> getAallTasks(){
        return tasks;
    }

    public void addTask(Task task){
        tasks.add(task);
    }

    public void markAsCompleted(Long id){
        for (Task task : tasks){
            if(task.getId().equals(id)){
                task.setCompleted(true);
                break;
            }
        }
    }
    public void deleteTask(Long id){
        tasks.removeIf(task -> task.getId().equals(id));
    }

    public int getCompletedTasksCount(){

        int count = 0;

        for(Task task : tasks){
            if(task.isCompleted()){
                count++;
            }
        }

        return count;
    }

    public int getPendingTasksCount(){

        int count = 0;

        for(Task task : tasks){
            if(!task.isCompleted()){
                count++;
            }
        }

        return count;
    }

    public int getTotalTasksCount(){
        return tasks.size();
    }
}
