package org.example.apigateway.course.course.repository;

import org.example.apigateway.course.course.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Integer> {
    Course findById(int id);

    List<Course> findByPriceGreaterThanAndTitleContaining(int price, String name);
}
