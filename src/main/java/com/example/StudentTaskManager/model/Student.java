package com.example.StudentTaskManager.model;

public class Student {

    private Long id;
    private String name;
    private String email;
    private String indexNumber;

    public Student() {
    }

    public Student(Long id, String name, String email, String indexNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.indexNumber = indexNumber;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }
}
