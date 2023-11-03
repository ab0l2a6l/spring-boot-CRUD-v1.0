package com.abolfazl.controller;

import com.abolfazl.model.entity.Car;
import com.abolfazl.model.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/car")
public class CarAPI {

    private final CarService carService;

    @PostMapping("/save")
    public ResponseEntity<Object> save(@RequestBody Car car) {
        carService.save(car);
        return ResponseEntity.ok(car);
    }

    @PostMapping("/update")
    public ResponseEntity<Object> update(@RequestBody Car car) {
        carService.update(car);
        return ResponseEntity.ok(car);
    }

    @PostMapping("/remove")
    public ResponseEntity<Object> remove(@RequestBody Car car) {
        carService.remove(car);
        return ResponseEntity.ok(car);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Car>> findAll() {
        return ResponseEntity.ok(carService.findAll());
    }

    @GetMapping("/findOne")
    public ResponseEntity<Optional<Car>> findAll(@ModelAttribute Car car) {
        return ResponseEntity.ok(carService.findOne(car));
    }

}
