package com.example.friday.service;

import com.example.friday.model.Tutorial;
import com.example.friday.model.TutorialDto;
import com.example.friday.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorialServiceImplementation implements TutorialService{

    @Autowired
    private TutorialRepository tutorialRepository;

    @Override
    public List<Tutorial> getAllTutorials() {
        return tutorialRepository.findAll();
    }

    @Override
    public Tutorial createTutorial(TutorialDto dto) {
        Tutorial tutorial = new Tutorial(
                dto.title, dto.description, dto.published
        );
        return tutorialRepository.save(tutorial);
    }
}
