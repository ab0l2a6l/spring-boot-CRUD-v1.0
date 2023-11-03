package com.abolfazl.model.service;

import com.abolfazl.model.entity.Car;
import com.abolfazl.model.entity.Person;
import com.abolfazl.model.repository.CarDA;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class CarService {
    private final CarDA carDA;

    @Transactional
    public void save(Car car) {
        log.info("invoke save car . . .");
        carDA.save(car);
    }

    @Transactional
    public void update(Car car) {
        log.info("invoke update car . . .");
        carDA.save(car);
    }

    @Transactional
    public void remove(Car car) {
        log.info("invoke delete car . . .");
        carDA.delete(car);
    }

    public List<Car> findAll() {
        log.info("invoke findAll car . . .");
        return carDA.findAll();
    }

    public Optional<Car> findOne(Car car) {
        log.info("invoke findOne car . . .");
        return carDA.findById(car.getId());
    }


}
