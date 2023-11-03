package com.abolfazl.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name = "person")
@Entity(name = "person")
@Data
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name = "personSeq", sequenceName = "person_seq", allocationSize = 1)
public class Person {
    @Id
    @GeneratedValue(generator = "personSeq")
    private long id;

    @Column(name = "name", columnDefinition = "varchar(20)")
    private String name;

    @Column(name = "family", columnDefinition = "varchar(20)")
    private String family;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "person_car", joinColumns = {@JoinColumn(name = "person_id")},inverseJoinColumns = {@JoinColumn(name = "car_id")})
    private List<Car> carList;
}
