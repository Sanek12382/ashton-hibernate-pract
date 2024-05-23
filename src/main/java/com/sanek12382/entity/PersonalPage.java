package com.sanek12382.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="personal_pages", schema = "HM1-base")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PersonalPage implements EntityBase {
    @Id
    @Column(name="id", nullable = false)
    private int id;
    @Column(name="role", nullable = false)
    private  String role;
    @Column(name="bio", nullable = false)
    private String bio;
    @Column(name="user_id", nullable = false)
    private int user_id;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
