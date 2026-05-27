package com.example.StudentTaskManager.controller;

import com.example.StudentTaskManager.model.Course;
import com.example.StudentTaskManager.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public String courses(Model model){

        model.addAttribute("courses", courseService.getAllCourses());

        return "courses";
    }

    @GetMapping("/courses/add")
    public String showAddCourseForm(Model model){

        model.addAttribute("course", new Course());

        return "add-course";
    }

    @PostMapping("/courses/add")
    public String addCourse(Course course){

        courseService.addCourse(course);

        return "redirect/courses";
    }


}
