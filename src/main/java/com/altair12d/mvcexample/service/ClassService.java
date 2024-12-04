package com.altair12d.mvcexample.service;

import com.altair12d.mvcexample.dto.ClassDto;
import com.altair12d.mvcexample.entity.ClassEntity;
import com.altair12d.mvcexample.mapper.ClassMapper;
import com.altair12d.mvcexample.repository.ClassRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClassService {
    private final ClassRepository classesRepository;

    public long createClass(ClassDto classes) {
        ClassEntity classEntity = ClassMapper.mapToEntity(classes);
        ClassEntity result = classesRepository.save(classEntity);
        return result.getId();
    }
    public ClassDto getClassById(long id) {
        ClassEntity classEntity = classesRepository.findById(id).orElse(null);
        return ClassMapper.mapToDto(classEntity);
    }

    public List<ClassDto> getAllClass(){
        List<ClassEntity> results = classesRepository.findAll();

        return results.stream().map(ClassMapper::mapToDto).toList();
    }
}
