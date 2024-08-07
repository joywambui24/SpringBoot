package com.example.friday.service;

import com.example.friday.model.Tutorial;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TutorialService {
    // abstraction
    List<Tutorial> getAllTutorials();
    Tutorial createTutorial();
}