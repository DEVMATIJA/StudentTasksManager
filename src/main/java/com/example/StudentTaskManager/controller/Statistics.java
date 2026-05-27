package com.example.StudentTaskManager.controller;

import com.example.StudentTaskManager.service.CourseService;
import com.example.StudentTaskManager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Statistics {

    @Autowired
    private TaskService taskService;

    @Autowired
    private CourseService courseService;

    @GetMapping("/statistics")
    public String statistics(Model model){

        model.addAttribute("totalTasks",
                taskService.getTotalTasksCount());
        model.addAttribute("completedTasks",
                taskService.getCompletedTasksCount());
        model.addAttribute("pendingTasks",
                taskService.getPendingTasksCount());
        model.addAttribute("totalCourses",
                courseService.getTotalCoursesCount());

        return "statistics";
    }
}
