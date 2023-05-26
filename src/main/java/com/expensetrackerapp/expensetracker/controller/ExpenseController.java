package com.expensetrackerapp.expensetracker.controller;

import com.expensetrackerapp.expensetracker.model.Expense;
import com.expensetrackerapp.expensetracker.model.Income;
import com.expensetrackerapp.expensetracker.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/expense")
public class ExpenseController {
    @Autowired
    private ExpenseService expenseService;
    @PostMapping("/addExpense")
    public String addExpense(@RequestBody Expense expense){
        expenseService.addExpense(expense);
        return "Expense added Successfully";

    }
    @GetMapping("getOne/{expenseId}")
    public Optional<Expense> getExpense(@PathVariable Long expenseId){
        return expenseService.getExpensebyId(expenseId);

    }
    @DeleteMapping("/deleteExpense/{expenseId}")
    public String deleteExpense(@PathVariable Long expenseId){
        expenseService.deleteExpense(expenseId);
        return "Expense deleted Successfully";
    }
    @GetMapping("/getAllExpense")
    public List<Expense> getAllExpense(){
       return expenseService.getAllExpense();
    }
    @PutMapping("/updateExpense/{expenseId}")
    public String updateIncome(@PathVariable Long expenseId,@RequestBody Expense expense){
        expenseService.updateExpense(expenseId,expense);
        return "Expense Updated successfully";
    }
}
