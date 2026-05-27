package com.example.StudentTaskManager.service;

import com.example.StudentTaskManager.model.Course;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    private List<Course> courses = new ArrayList<>();

    @PostConstruct
    public void init(){
        courses.add(new Course(
                1L,
                "Web Programming",
                "Marko Markovic"
        ));
        courses.add(new Course(
                2L,
                "Databases",
                "Nikola Nikolic"
        ));
    }

    public List<Course> getAllCourses(){
        return courses;
    }

    public void addCourse(Course course){
        courses.add(course);
    }
}
