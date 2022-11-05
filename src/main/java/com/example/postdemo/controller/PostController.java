package com.example.postdemo.controller;

import com.example.postdemo.domain.Post;
import com.example.postdemo.dto.PostDto;
import com.example.postdemo.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/posts")
@RequiredArgsConstructor
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/")
    public List<PostDto> getPosts(){
        return postService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}") // api/v1/products/{id}
    public PostDto getProduct(@PathVariable("id")int id){
        return postService.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void save(@RequestBody PostDto postDto){
        postService.save(postDto);
    }
}
