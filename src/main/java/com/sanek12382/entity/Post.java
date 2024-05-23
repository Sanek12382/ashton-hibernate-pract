package com.sanek12382.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="posts", schema = "HM1-base")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Post implements EntityBase {

    @Id
    @Column(name="id", nullable = false)
    private int id;
    @Column(name="title", nullable = false)
    private String title;
    @Column(name="body", nullable = false)
    private String body;
    @Column(name="status", nullable = false)
    private String status;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user ;
}
