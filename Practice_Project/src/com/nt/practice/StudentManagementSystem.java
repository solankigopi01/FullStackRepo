package com.nt.practice;

import java.util.*;

//Student class (Entity)
class Student {
 private int id;
 private String name;
 private String branch;
 private double percentage;

 // Constructor
 public Student(int id, String name, String branch, double percentage) {
     this.id = id;
     this.name = name;
     this.branch = branch;
     this.percentage = percentage;
 }

 // Getters and Setters
 public int getId() { return id; }
 public String getName() { return name; }
 public String getBranch() { return branch; }
 public double getPercentage() { return percentage; }

 public void setName(String name) { this.name = name; }
 public void setBranch(String branch) { this.branch = branch; }
 public void setPercentage(double percentage) { this.percentage = percentage; }

 @Override
 public String toString() {
     return "Student [ID=" + id + ", Name=" + name + ", Branch=" + branch + ", Percentage=" + percentage + "]";
 }
}

//Main Application
public class StudentManagementSystem {

 private static ArrayList<Student> students = new ArrayList<>();
 private static Scanner sc = new Scanner(System.in);

 public static void main(String[] args) {
     int choice;

     
 }
}
