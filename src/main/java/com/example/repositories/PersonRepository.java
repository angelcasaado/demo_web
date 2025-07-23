package com.example.repositories;

import com.example.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    // JpaRepository ya proporciona métodos CRUD básicos
}