package com.example.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo1.model.TutorialModel;

public interface TutorialRepository extends JpaRepository<TutorialModel,Long>{
    
}