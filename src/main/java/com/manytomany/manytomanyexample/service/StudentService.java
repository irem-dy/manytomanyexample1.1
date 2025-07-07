package com.manytomany.manytomanyexample.service;

import com.manytomany.manytomanyexample.entity.Course;
import com.manytomany.manytomanyexample.entity.Student;
import com.manytomany.manytomanyexample.repo.CourseRepository;
import com.manytomany.manytomanyexample.repo.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;

    public StudentService(StudentRepository studentRepository, CourseRepository courseRepository) {
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    /**
     * Yeni öğrenci oluşturur ve belirtilen kurslarla ilişkilendirir.
     *
     * @param studentName Öğrencinin adı
     * @param courseIds İlişkilendirilecek kursların ID listesi
     * @return Kaydedilen Student nesnesi
     */
    public Student createStudentWithCourses(String studentName, List<Long> courseIds) {
        Student student = new Student();
        student.setName(studentName);

        // Kursları veritabanından bul ve set olarak ata
        Set<Course> courses = new HashSet<>(courseRepository.findAllById(courseIds));
        student.setCourses(courses);

        // Öğrenciyi kaydet ve dön
        return studentRepository.save(student);
    }

    /**
     * Veritabanındaki tüm öğrencileri döner.
     *
     * @return Öğrenci listesi
     */
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
