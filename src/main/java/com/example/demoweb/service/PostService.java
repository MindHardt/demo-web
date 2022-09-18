package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    private final List<Post> posts = new ArrayList<>(List.of(new Post[]{
            new Post("Post №1", new Date()),
            new Post("Lorem Ipsum Dolorem Sit Amet", new Date()),
            new Post("Hocus Pocus Fidibus", new Date())
    }));

    public Post[] getAllPosts() {
        return posts.toArray(new Post[0]);
    }

    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }
}
