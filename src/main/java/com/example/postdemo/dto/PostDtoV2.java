package com.example.postdemo.dto;

import lombok.Data;

@Data
public class PostDtoV2 {

    private long id;
    private String title;
    private String content;
    private String author;
    private String rate;

}
