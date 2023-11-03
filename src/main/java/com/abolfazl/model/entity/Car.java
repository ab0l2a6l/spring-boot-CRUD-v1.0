package com.abolfazl.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name = "car")
@Entity(name = "car")
@Data
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name = "carSeq", sequenceName = "car_seq", allocationSize = 1)
public class Car {
    @Id
    @GeneratedValue(generator = "carSeq")
    private long id;

    @Column(name = "model", columnDefinition = "varchar(20)")
    private String model;

    @ManyToMany(mappedBy = "carList", cascade =  CascadeType.PERSIST)
    private List<Person> person;
}
