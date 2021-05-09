package com.example.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="job_titles")
public class JobTitle {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;
    @Column(name="title")
    private String title;
}
