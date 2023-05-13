package com.expensetrackerapp.expensetracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Expense {
    @Id
    private Long expenseId;
    private double amount;
    private LocalDate date;
    private String purpose;
    private String description;
    private Long userId;

}
