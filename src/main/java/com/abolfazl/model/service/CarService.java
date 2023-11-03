package com.abolfazl.model.service;

import com.abolfazl.model.entity.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {
    void save(Car car);

    void update(Car car);

    void remove(long id);

    List<Car> findAll();

    Optional<Car> findOne(Car car);
}
