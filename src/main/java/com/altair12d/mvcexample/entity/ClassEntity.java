package com.altair12d.mvcexample.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="class")
@Getter
@Setter
public class ClassEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @OneToMany(mappedBy = "class", fetch = FetchType.LAZY)
    public List<StudentEntity> studentList;
}
