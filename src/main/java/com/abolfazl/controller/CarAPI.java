package com.abolfazl.controller;

import com.abolfazl.model.entity.Car;
import com.abolfazl.model.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/car")
public class CarAPI {
    private final CarService carService;

    @GetMapping("/save")
    public ResponseEntity<Object> save(@ModelAttribute Car car){
        carService.save(car);
        return ResponseEntity.ok(car);
    }

    @GetMapping("/update")
    public ResponseEntity<Object> update(@ModelAttribute Car car){
        carService.update(car);
        return ResponseEntity.ok(car);
    }

    @GetMapping("/remove")
    public ResponseEntity<Object> remove(@ModelAttribute Car car){
        carService.remove(car);
        return ResponseEntity.ok(car);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Car>> findAll(){
        return ResponseEntity.ok(carService.findAll());
    }

    @GetMapping("/findOne")
    public ResponseEntity<Optional<Car>> findAll(@ModelAttribute Car car){
        return ResponseEntity.ok(carService.findOne(car));
    }

}
