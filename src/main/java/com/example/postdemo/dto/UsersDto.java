package com.example.postdemo.dto;

import com.example.postdemo.domain.Post;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UsersDto  implements Serializable {

        private long id;
        private String name;
        private List<Post> posts;
    }

