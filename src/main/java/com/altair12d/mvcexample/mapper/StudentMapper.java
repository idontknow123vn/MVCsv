package com.altair12d.mvcexample.mapper;

import com.altair12d.mvcexample.dto.StudentDto;
import com.altair12d.mvcexample.entity.StudentEntity;

public class StudentMapper {
    public static StudentDto mapToDto(StudentEntity studentEntity) {
        if(studentEntity == null) return null;
        StudentDto studentDto = new StudentDto();
        studentDto.setId(studentEntity.getId());
        studentDto.setName(studentEntity.getName());
        studentDto.setScore(studentEntity.getScore());
        return studentDto;
    }
    public static StudentEntity mapToEntity(StudentDto studentDto) {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setId(studentDto.getId());
        studentEntity.setName(studentDto.getName());
        studentEntity.setScore(studentDto.getScore());
        return studentEntity;
    }
}
