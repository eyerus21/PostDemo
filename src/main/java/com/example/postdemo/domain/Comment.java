package com.example.postdemo.domain;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    @Id
    private long id;
    String name;

//    @ManyToOne(cascade = CascadeType.ALL)
//    private Post post;

}
