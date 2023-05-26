package com.expensetrackerapp.expensetracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.sql.ast.tree.predicate.ExistsPredicate;

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
    @Enumerated(EnumType.STRING)
    private ExpenseSource expenseSource;
    private String description;
    private Long userId;

}
