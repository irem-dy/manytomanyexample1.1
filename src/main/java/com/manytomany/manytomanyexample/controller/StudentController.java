package com.manytomany.manytomanyexample.controller;
import com.manytomany.manytomanyexample.dto.StudentCreateRequest;
import com.manytomany.manytomanyexample.entity.Student;
import com.manytomany.manytomanyexample.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    // Constructor Injection ile servis bağımlılığı alınıyor
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // POST isteği ile JSON body içinden öğrenci oluşturma
    @PostMapping("/create")
    public Student createStudent(@RequestBody StudentCreateRequest request) {
        return studentService.createStudentWithCourses(request.getName(), request.getCourseIds());
    }

    // Tüm öğrencileri listeleyen GET endpoint
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}
