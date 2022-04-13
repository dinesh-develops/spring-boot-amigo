package com.example.amigo.model;

import java.time.LocalDate;

public class Student {
    private int Id;
    private String name;
    private String emailId;
    private  int age;
    private LocalDate dob;

    public Student(int id, String name, String emailId, int age, LocalDate dob) {
        Id = id;
        this.name = name;
        this.emailId = emailId;
        this.age = age;
        this.dob = dob;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", emailId='" + emailId + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                '}';
    }
}
