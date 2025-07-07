package com.manytomany.manytomanyexample.repo;

import com.manytomany.manytomanyexample.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
