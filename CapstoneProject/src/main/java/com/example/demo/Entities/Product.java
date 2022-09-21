package com.example.demo.Entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;


@Entity
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int modelNumber;
    private LocalDate datedPurchase;
    private int warrantyYears;
    private LocalDate warrantyDate;
    @OneToMany
    private List<Complaint> complaint;
    @ManyToOne
    @JsonIgnore
    private Client client;

}
