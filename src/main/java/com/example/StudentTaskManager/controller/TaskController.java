package com.example.StudentTaskManager.controller;



import com.example.StudentTaskManager.model.Task;
import com.example.StudentTaskManager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;


@Controller
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/tasks")
    public String tasks(Model model) {
        model.addAttribute("tasks", taskService.getAallTasks());

        return "tasks";
    }

    @GetMapping("/tasks/add")
    public String showAddTaskForm(Model model){
        model.addAttribute("task", new Task());
        return "add-task";
    }

    @PostMapping("/tasks/add")
    public String addTask(@Valid Task task, BindingResult result) {

        if (result.hasErrors()) {
            return "add-task";
        }

        taskService.addTask(task);
        return "redirect:/tasks";
    }

    @GetMapping("/tasks/complete/{id}")
    public String completeTask(@PathVariable Long id){
        taskService.markAsCompleted(id);
        return "redirect:/tasks";
    }

    @GetMapping("/tasks/delete/{id}")
    public String deleteTask(@PathVariable Long id){
        taskService.deleteTask(id);
        return "redirect:/tasks";
    }


}
