package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PostService {
    public Post[] getAllPosts() {
        return new Post[ ]{
            new Post("Post №1", new Date()),
            new Post("Lorem Ipsum Dolorem Sit Amet", new Date()),
            new Post("Hocus Pocus Fidibus", new Date())
        };
    }
}
