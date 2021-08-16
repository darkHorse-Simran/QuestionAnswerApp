package com.application.postgresdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.postgresdemo.model.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

}
