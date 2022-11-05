package com.example.postdemo.service.impl;

import com.example.postdemo.domain.Post;
import com.example.postdemo.dto.PostDto;
import com.example.postdemo.helper.ListMapper;
import com.example.postdemo.repo.PostRepo;
import com.example.postdemo.service.PostService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepo postRepo;

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    ListMapper<Post, PostDto> postPostDtoListMapper;



    @Override
    public List<PostDto> findAll() {
        return (List<PostDto>) postPostDtoListMapper.mapList(postRepo.findAll(), new PostDto());
    }

    @Override
    public PostDto findById(int id) {
        return modelMapper.map(postRepo.findById(id), PostDto.class);
    }

    @Override
    public void save(PostDto postDto) {
        postRepo.save(modelMapper.map(postDto, Post.class));
    }
}
