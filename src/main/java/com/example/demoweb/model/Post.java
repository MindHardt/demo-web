package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private final Long id;
    private final String text;
    private Integer likes;
    private final Date creationDate;

    public Post(Long id, String text, Date creationDate) {
        this.id = id;
        this.text = text;
        this.likes = 0;
        this.creationDate = creationDate;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(int value) {
        likes = value;
    }

    public String getText() {
        return text;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Long getId() {
        return id;
    }
}
