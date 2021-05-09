package com.example.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="users")
public class User {

     @Id
    @GeneratedValue

    @Column(name ="id")
    private int id;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

}
