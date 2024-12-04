package com.altair12d.mvcexample.controller;

import com.altair12d.mvcexample.dto.ClassDto;
import com.altair12d.mvcexample.service.ClassService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class ClassController {
    private final ClassService classService;

    @GetMapping("/classes")
    public ResponseEntity<?> getAllClasses(){
        return ResponseEntity.ok(classService.getAllClass());
    }

    @PostMapping("/classes")
    public ResponseEntity<Long> createClass(@RequestBody ClassDto classDto){
        return ResponseEntity.ok(classService.createClass(classDto));
    }

    @GetMapping("/classes/{id}")
    public ResponseEntity<ClassDto> getClassById(@PathVariable long id){
        return ResponseEntity.ok(classService.getClassById(id));
    }
}
