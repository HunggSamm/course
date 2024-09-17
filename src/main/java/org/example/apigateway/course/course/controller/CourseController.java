package org.example.apigateway.course.course.controller;
import org.example.apigateway.course.course.model.Course;
import org.example.apigateway.course.course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;


    @GetMapping("/courses")
    public List<Course> getAllCourse() {
        return courseService.getAllCourses();

    }

    @PostMapping("/courses")
    public ResponseEntity<?> newCourse(@RequestBody Course course) {
        courseService.newCourse(course);
        return ResponseEntity.status(HttpStatus.CREATED).body("Course added successfully");
    }

    @GetMapping("/courses/filter")
    public ResponseEntity<List<Course> > filteCourse(@RequestParam int price, @RequestParam String name) {
        return ResponseEntity.ok(courseService.filterCourse(price, name));
    }

}
