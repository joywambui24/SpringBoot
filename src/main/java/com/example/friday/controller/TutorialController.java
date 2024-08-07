package com.example.friday.controller;

import com.example.friday.model.Tutorial;
import com.example.friday.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tutorial")
public class TutorialController {

    @Autowired
    private TutorialService tutorialService;

    @GetMapping("/getAllTutorials")
    public List<Tutorial> getAllTutorials(){
        return tutorialService.getAllTutorials();
    }
}
