package com.codingwithmitch.notes.models;

public class Student {

    private int userID;

    private int id;

    private String title;

    //@SerializedName("body")
    private String text;

    public int getUserID() {
        return userID;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}