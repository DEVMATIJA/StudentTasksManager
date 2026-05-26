package com.example.StudentTaskManager.model;

public class Reminder {

    private Long id;
    private String reminderDate;

    public Reminder() {
    }

    public Reminder(Long id, String reminderDate) {
        this.id = id;
        this.reminderDate = reminderDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReminderDate() {
        return reminderDate;
    }

    public void setReminderDate(String reminderDate) {
        this.reminderDate = reminderDate;
    }
}