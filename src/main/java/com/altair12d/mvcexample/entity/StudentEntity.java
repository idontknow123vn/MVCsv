package com.altair12d.mvcexample.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="student")
@Getter
@Setter
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private double score;
    @ManyToOne
    @JoinColumn(name="class_id")
    private ClassEntity aClass;
}
