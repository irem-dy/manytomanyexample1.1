package com.manytomany.manytomanyexample.repo;

import com.manytomany.manytomanyexample.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
