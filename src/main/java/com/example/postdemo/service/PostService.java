package com.example.postdemo.service;

import com.example.postdemo.domain.Post;
import com.example.postdemo.dto.PostDto;

import java.util.List;

public interface PostService {

    List<PostDto> findAll();
    PostDto findById(int id);

    void save(PostDto postDto);

    void savePost(Post post);
}
