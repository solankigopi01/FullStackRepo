package com.nt.newPractice;

import java.util.*;

//Book class (Entity)
class Book {
 private int id;
 private String title;
 private String author;
 private boolean isIssued;

 public Book(int id, String title, String author) {
     this.id = id;
     this.title = title;
     this.author = author;
     this.isIssued = false; // By default not issued
 }

 // Getters
 public int getId() { return id; }
 public String getTitle() { return title; }
 public String getAuthor() { return author; }
 public boolean isIssued() { return isIssued; }

 // Setters
 public void setIssued(boolean issued) { isIssued = issued; }

 @Override
 public String toString() {
     return "Book [ID=" + id + ", Title=" + title + ", Author=" + author + ", Issued=" + (isIssued ? "Yes" : "No") + "]";
 }
}

//Library Management System
public class LibraryManagementSystem {
 //private static ArrayList<Book> books = new ArrayList<>();

 public static void main(String[] args) {
     int choice;
 }
}
