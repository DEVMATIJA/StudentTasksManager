package com.example.StudentTaskManager.model;

public class Course {

    private Long id;
    private String name;
    private String professor;

    public Course() {
    }

    public Course(Long id, String name, String professor) {
        this.id = id;
        this.name = name;
        this.professor = professor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }
}
