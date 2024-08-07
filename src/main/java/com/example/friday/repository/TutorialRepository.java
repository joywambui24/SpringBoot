package com.example.friday.repository;

import com.example.friday.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial,Long> {
    // extends for inheritance

}
