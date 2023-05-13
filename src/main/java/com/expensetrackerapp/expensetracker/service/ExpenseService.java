package com.expensetrackerapp.expensetracker.service;

import com.expensetrackerapp.expensetracker.model.Expense;
import com.expensetrackerapp.expensetracker.reposotory.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseService {
    @Autowired
    private ExpenseRepository expenseRepository;
    public void addExpense(Expense expense){
        expenseRepository.save(expense);
    }
    public Optional<Expense> getExpensebyId(Long expenseId){
        return expenseRepository.findById(expenseId);
    }
    public void deleteExpense(Long expenseId){
        expenseRepository.deleteById(expenseId);
    }
    public List<Expense> getAllExpense(){
       return expenseRepository.findAll();
    }
}
