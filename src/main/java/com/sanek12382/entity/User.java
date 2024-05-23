package com.sanek12382.entity;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="users", schema = "HM1-base")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User implements EntityBase {
    @Id
    @Column(name="id", nullable = false)
    private int id;

    @Column(name = "username", nullable = false)
    private String username;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Post> posts;
    @ManyToMany
    @JoinTable(
            name = "users_groupchats",
            joinColumns = {@JoinColumn (name= "user_id")},
            inverseJoinColumns = {@JoinColumn (name="chat_id")}
    )
    private List<Groupchat> groupchat;
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private PersonalPage page;
}
