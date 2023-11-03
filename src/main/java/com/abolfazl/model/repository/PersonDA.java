package com.abolfazl.model.repository;

import com.abolfazl.model.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDA extends JpaRepository<Person, Long> {

}
