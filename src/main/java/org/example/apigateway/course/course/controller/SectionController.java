package org.example.apigateway.course.course.controller;


import org.example.apigateway.course.course.model.Section;
import org.example.apigateway.course.course.model.request.SectionRequest;
import org.example.apigateway.course.course.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class SectionController {
    @Autowired
    private SectionService sectionService;

    @GetMapping("/sections")
    public List<Section> getAllSection() {
        return sectionService.getAllSections();
    }

    @PostMapping("/sections")
    public String newSection(@RequestBody SectionRequest sectionRequest) {
        sectionService.newSection(sectionRequest);
        return "Section added successfully";
    }
}
