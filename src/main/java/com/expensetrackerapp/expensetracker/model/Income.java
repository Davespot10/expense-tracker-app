package com.expensetrackerapp.expensetracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Locale;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Income {
    @Id
    private Long incomeId;
    private double amount;
    private Date date;
    @Enumerated(EnumType.STRING)
    private IncomeSource incomeSource;
    private String description;
    private Long userId;

}
