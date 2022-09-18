package com.example.demoweb.controller;

import com.example.demoweb.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostsCreateController {

    @Autowired
    private PostService postService = null;

    @RequestMapping(path = "/new", method = RequestMethod.GET)
    public String create(Model model) {
        return "create";
    }

    @RequestMapping(path = "/new", method = RequestMethod.POST)
    public String doCreate(Model model, @ModelAttribute("text") String text) {
        postService.create(text);
        return "redirect:/";
    }
}

