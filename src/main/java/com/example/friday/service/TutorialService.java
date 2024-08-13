package com.example.friday.service;

import com.example.friday.model.Response;
import com.example.friday.model.Tutorial;
import com.example.friday.model.TutorialDto;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface TutorialService {
    // abstraction
    Response<List<Tutorial>> getAllTutorials();
    Tutorial createTutorial(TutorialDto dto);
    Optional<Tutorial> getTutorialById(Long id);
    Tutorial updateTutorial(Long id, TutorialDto dto);
    String deleteTutorial(Long id);
}
