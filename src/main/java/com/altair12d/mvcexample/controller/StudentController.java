package com.altair12d.mvcexample.controller;

import com.altair12d.mvcexample.dto.StudentDto;
import com.altair12d.mvcexample.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class StudentController {
    private final StudentService studentService;

    @PostMapping("/students")
    public ResponseEntity<Long> createStudent(@RequestBody StudentDto studentDto) {
        long result = studentService.createStudent(studentDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }
    @GetMapping("/students/{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable long id) {
        StudentDto result = studentService.getStudentById(id);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
    @GetMapping("/students")
    public ResponseEntity<?> getAllStudents() {
        List<StudentDto> result = studentService.getAllStudents();
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
