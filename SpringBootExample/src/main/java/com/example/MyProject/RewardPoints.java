package com.example.MyProject;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "RewardPoints", schema = "CUSTOMER")
@Getter
@Setter
@NoArgsConstructor
public class RewardPoints {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    @Id
    @Column(name = "CUTOMER_ID", nullable = false)
    private Long customerId;
    
    @Column(name = "MONTH", nullable = false)
    private int month;
    
    @Column(name = "YEAR", nullable = false)
    private int year;
    
    @Column(name = "POINTS", nullable = false)
    private int points;




}
