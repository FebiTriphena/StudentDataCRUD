package com.febi.StudentAppCRUD.api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class StudentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollNo;
    @Column(name = "NAME")
    private String name;
    @Column(name = "PERCENTAGE")
    private double percentage;
    @Column(name = "DEPARTMENT")
    private String department;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public StudentModel(String name, double percentage, String department) {
        this.name = name;
        this.percentage = percentage;
        this.department = department;
    }

    public StudentModel() {
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                ", department='" + department + '\'' +
                '}';
    }
}
