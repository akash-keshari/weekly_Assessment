package com.example.demo.Entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDate;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Complaint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer complaintId;
    private String complainName;
    private String status;
    private Date date;
    @ManyToOne
    @JsonIgnore
    private Client client;
    @ManyToOne
    @JsonIgnore
    private Product product;
    @ManyToOne
    @JsonIgnore
    private Engineer engineer;
}
	
	