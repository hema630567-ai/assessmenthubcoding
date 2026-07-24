package com.famehub.famehub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.famehub.famehub.entity.Assessment;
import com.famehub.famehub.repository.AssessmentRepository;

@RestController
@RequestMapping("/api/assessment")
public class AssessmentController {

    @Autowired
    private AssessmentRepository assessmentRepository;

    @PostMapping("/create")
    public ResponseEntity<?> createAssessment(
            @RequestBody Assessment assessment) {

        Assessment saved = assessmentRepository.save(assessment);
        return ResponseEntity.ok(saved);
    }
}