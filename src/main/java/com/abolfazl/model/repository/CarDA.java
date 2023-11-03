package com.abolfazl.model.repository;

import com.abolfazl.model.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarDA extends JpaRepository<Car,Long> {

}
