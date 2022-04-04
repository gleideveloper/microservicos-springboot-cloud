package com.devsuperior.hrworker.entitier;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tb_worker")
public class Worker {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_worker", nullable = false)
    private Long idWorker;
    private String name;
    private Double dailyIncome;
}

