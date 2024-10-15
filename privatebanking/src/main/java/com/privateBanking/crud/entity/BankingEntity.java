package com.privateBanking.crud.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="banks")
@Data
public class BankingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="minimal_deposit")
    private String deposit;

    @Column(name="net_worth")
    private String networth;

    @Column(name="description")
    private String description;
}

