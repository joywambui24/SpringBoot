package com.example.friday.controller;

import com.example.friday.model.Tutorial;
import com.example.friday.model.TutorialDto;
import com.example.friday.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/tutorial")
public class TutorialController {

    @Autowired
    private TutorialService tutorialService;

    @GetMapping("/getAllTutorials")
    public List<Tutorial> getAllTutorials(){
        return tutorialService.getAllTutorials();
    }


    @PostMapping(value = "/createTutorial", produces = "application/json", consumes = "application/json")
    public Tutorial createTutorial(@RequestBody @Validated TutorialDto dto) {
       return tutorialService.createTutorial(dto);
    }

    @GetMapping(value = "/getById", produces = "application/json")
    public Optional<Tutorial> getById(@RequestParam Long id){
        return tutorialService.getTutorialById(id);
    }


}
