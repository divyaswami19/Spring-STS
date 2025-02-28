package com.example.rest_demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest_demo.model.Student;

@RestController
@RequestMapping("/student")

public class StudentAPIService {

    Student student;

    @GetMapping("{stdId}")

    public Student getStudentDetails(String stdId)
    {
        return student; 
        //new Student("s1","divya","xx");
    }

    @PostMapping
    public String createStudentDetails(@RequestBody Student student){

         this.student=student;
         return "Student data Created Successfully";
    }

    @PutMapping
    public String updateStudentDetails(@RequestBody Student student){

        this.student=student;
        return "Student data Updated Successfully";
    }
    
    @DeleteMapping("{stdId}")
    public String deleteStudentDetails(String stdId){

        this.student=null;
        return "Student data Deleted Successfully";
    }


}
