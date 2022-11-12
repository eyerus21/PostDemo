package com.example.postdemo.domain;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Post {
    @Id
    @GeneratedValue
    private long id;

    @NotNull
    @Size(min=1 , max= 10 ,message = "{size.name.validation}")
//    @Size(min=1 , max= 500 )
    private String title;

    private String content;
    private String author;

//    @ManyToMany
//    @JoinTable(name = "posts")
//    private List<Users> users;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
//    @JoinColumn(name = "commentId")
//    private List<Comment> comment;
}
