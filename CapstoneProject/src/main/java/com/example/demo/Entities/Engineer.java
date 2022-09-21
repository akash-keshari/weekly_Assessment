package com.example.demo.Entities;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.*;

@Entity
@Data
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Engineer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer engineerId;
    private String password;
    private String engineerName;
    private String domain;
    @OneToMany
    private List<Complaint> complaint;

}
