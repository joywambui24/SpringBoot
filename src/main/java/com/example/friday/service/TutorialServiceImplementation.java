package com.example.friday.service;

import com.example.friday.model.Tutorial;
import com.example.friday.model.TutorialDto;
import com.example.friday.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Optional<Tutorial> getTutorialById(Long id) {
        return tutorialRepository.findById(id);
    }

    @Override
    public Tutorial updateTutorial(Long id, TutorialDto dto) {
       Optional<Tutorial> tutorial = tutorialRepository.findById(id);
       if(tutorial.isPresent()){
           Tutorial data = tutorial.get();
           data.setTitle(dto.title);
           data.setDescription(dto.description);
           data.setPublished(dto.published);
           return tutorialRepository.save(data);
       }
        return null;
    }

    @Override
    public String deleteTutorial(Long id) {
        Optional<Tutorial> tutorial = tutorialRepository.findById(id);
        if(tutorial.isPresent()){
           Tutorial data = tutorial.get();
           tutorialRepository.deleteById(data.getId());

           return "Tutorial id " +  data.getId() + " is deleted";
        }

        return "";
    }
}
