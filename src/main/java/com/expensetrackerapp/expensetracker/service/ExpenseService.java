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
    public void updateExpense(Long expenseId, Expense expense){
        Optional<Expense> expense1=expenseRepository.findById(expenseId);
        if(expense1.isPresent()){
            Expense expense2=expense1.get();
            expense2.setExpenseSource(expense.getExpenseSource());
            expense2.setAmount(expense.getAmount());
            expense2.setDate(expense.getDate());
            expense2.setDescription(expense.getDescription());
            expense2.setUserId(expense.getUserId());
            expenseRepository.save(expense2);
        }
    }
    public List<Expense> getAllExpense(){
       return expenseRepository.findAll();
    }
}
