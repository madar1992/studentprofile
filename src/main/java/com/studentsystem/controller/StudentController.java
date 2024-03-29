package com.studentsystem.controller;

import com.studentsystem.model.Student;
import com.studentsystem.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New student is added";
    }

    
    @GetMapping("/getAll")
    public List<Student> listall(){
        return studentService.getAllStudents();
    }
    
    // This is updated code --Nagul
}
