package org.example.apigateway.course.course.repository;

import org.example.apigateway.course.course.model.Section;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionRepository extends JpaRepository<Section, Integer> {
    Section findById(int id);
}
