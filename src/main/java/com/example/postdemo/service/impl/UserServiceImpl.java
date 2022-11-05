package com.example.postdemo.service.impl;

import com.example.postdemo.domain.Post;
import com.example.postdemo.domain.Users;
import com.example.postdemo.dto.PostDto;
import com.example.postdemo.dto.UsersDto;
import com.example.postdemo.helper.ListMapper;
import com.example.postdemo.repo.UserRepo;
import com.example.postdemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private ListMapper<Users, UsersDto> usersToUsersDtoListMapper;
    @Autowired
    private ListMapper<Post, PostDto> PostToPostDtoListMapper;

    @Override
    public List<UsersDto> findAll() {

        return (List<UsersDto>) usersToUsersDtoListMapper.mapList(userRepo.findAll(),new UsersDto());
    }

    @Override
    public UsersDto findById(long id) {
        return modelMapper.map(userRepo.findById(id),UsersDto.class);
    }

    @Override
    public void save(UsersDto usersDto) {
        userRepo.save(modelMapper.map((usersDto),Users.class));
    }

    @Override
    public List<PostDto> findPostsByUserId(long id) {
        return (List<PostDto>) PostToPostDtoListMapper.mapList(userRepo.findPostsByUsersId(id),new PostDto()) ;
    }

    @Override
    public List<UsersDto> findAllUsersByPostGreaterThanOne() {
        return (List<UsersDto>) usersToUsersDtoListMapper.mapList(userRepo.findAllUsersByPostGreaterThanOne(), new UsersDto());
    }
}
