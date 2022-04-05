package com.devsuperior.hrpayroll.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Worker implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long idWorker;
    private String name;
    private Double dailyIncome;
}

