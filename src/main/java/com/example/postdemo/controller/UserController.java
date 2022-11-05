package com.example.postdemo.controller;


import com.example.postdemo.dto.PostDto;
import com.example.postdemo.dto.UsersDto;
import com.example.postdemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/user")
@RequiredArgsConstructor
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/allUsers")
    public List<UsersDto> findAll(){
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public UsersDto findUserById(@PathVariable("id") long id){
        return userService.findById(id);
    }

    @PostMapping("/save")
    public void save(UsersDto usersDto){
        userService.save(usersDto);
    }

    @GetMapping("{id}/posts")
    public List<PostDto>  findPostByUserId(@PathVariable("id") long id){
        return userService.findPostsByUserId(id);
    }

}
