package com.example.postdemo.repo.impl;

import com.example.postdemo.domain.Post;
import com.example.postdemo.repo.PostRepo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PostRepoImpl implements PostRepo {


    private static List<Post> posts = new ArrayList<>();
    private static long postId=300L;

    static {
        Post post1= new Post(1L,"hel", "hel","hel");
        Post post2= new Post(2L,"hel", "hel","hel");

        posts.add(post1);
        posts.add(post2);
    }



    @Override
    public List<Post> findAll() {
        return posts;
    }

    @Override
    public Post findById(long id) {
        return posts.stream().filter(post -> post.getId()==id)
                .findFirst().orElse(null);
    }

    @Override
    public void save(Post post) {

        post.setId(postId);
        postId++;
        posts.add(post);

    }


}

