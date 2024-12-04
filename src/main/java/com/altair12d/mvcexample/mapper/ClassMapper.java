package com.altair12d.mvcexample.mapper;

import com.altair12d.mvcexample.dto.ClassDto;
import com.altair12d.mvcexample.entity.ClassEntity;

public class ClassMapper {
    public static ClassEntity mapToEntity(ClassDto classDto) {
        ClassEntity classEntity = new ClassEntity();
        classEntity.setId(classDto.getId());
        classEntity.setName(classDto.getName());
        return classEntity;
    }
    public static ClassDto mapToDto(ClassEntity classEntity) {
        if(classEntity == null) return null;
        ClassDto classDto = new ClassDto();
        classDto.setId(classEntity.getId());
        classDto.setName(classEntity.getName());
        classEntity.setStudentList(classEntity.getStudentList());
        return classDto;
    }
}
