package org.example.apigateway.course.course.repository;

import org.example.apigateway.course.course.model.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Integer> {

}
