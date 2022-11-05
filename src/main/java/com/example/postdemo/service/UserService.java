package com.example.postdemo.service;

import com.example.postdemo.dto.PostDto;
import com.example.postdemo.dto.UsersDto;

import java.util.List;

public interface UserService  {

    List<UsersDto> findAll();
    UsersDto findById(long id);
    void save(UsersDto usersDto);

    List<PostDto> findPostsByUserId (long id);

    List<UsersDto> findAllUsersByPostGreaterThanOne();


}
