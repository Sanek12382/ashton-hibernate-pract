package com.sanek12382.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
public class Groupchat implements EntityBase {
    @Id
    @Column(name="id", nullable = false)
    private int id;
    @Column(name = "chatname", nullable = false)
    private String chatname;
    @Column(name = "messages", nullable = false)
    private String messages;
}
