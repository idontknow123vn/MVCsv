package com.altair12d.mvcexample.service;

import com.altair12d.mvcexample.dto.StudentDto;
import com.altair12d.mvcexample.entity.StudentEntity;
import com.altair12d.mvcexample.mapper.StudentMapper;
import com.altair12d.mvcexample.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    public long createStudent(StudentDto dto) {
        StudentEntity entity = StudentMapper.mapToEntity(dto);
        StudentEntity result = studentRepository.save(entity);
        return result.getId();
    }
    public StudentDto getStudentById(long id) {
        StudentEntity entity = studentRepository.findById(id).orElse(null);
        return StudentMapper.mapToDto(entity);
    }
    public List<StudentDto> getAllStudents(){
        List<StudentEntity> results = studentRepository.findAll();

        return results.stream().map(StudentMapper::mapToDto).toList();
    }

}
