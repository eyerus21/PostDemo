package com.example.postdemo.repo;

import com.example.postdemo.domain.Post;
import com.example.postdemo.domain.versionDemo.PostV2;
import com.example.postdemo.dto.PostDto;

import java.util.List;

public interface PostRepo {
    List<Post> findAll();



     Post findById(long id);

    void save(Post post);

//    void updatePostById(long id, PostDto p);
//
//    void deleteById(long id);
//
//    PostV2 findByAuthor(String author);
}
