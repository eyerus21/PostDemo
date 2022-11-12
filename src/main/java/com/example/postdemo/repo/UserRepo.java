package com.example.postdemo.repo;

import com.example.postdemo.domain.Post;
import com.example.postdemo.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepo extends JpaRepository<Users,Long> {

    @Query("select u.posts from Users u where u.id=:id")
    List<Post> findPostsByUsersId(@Param("id") long id);

    @Query("select u from Users u where u.posts.size>1")
    List<Users> findAllUsersByPostGreaterThanOne();





}
