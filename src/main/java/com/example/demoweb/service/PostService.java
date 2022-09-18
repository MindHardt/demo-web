package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    public Post[] getAllPosts() {
        return new Post[ ]{
            new Post("Post №1"),
            new Post("Lorem Ipsum Dolorem Sit Amet"),
            new Post("Hocus Pocus Fidibus")
        };
    }
}
