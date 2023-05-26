package com.expensetrackerapp.expensetracker.controller;

import com.expensetrackerapp.expensetracker.model.Expense;
import com.expensetrackerapp.expensetracker.model.Income;
import com.expensetrackerapp.expensetracker.model.User;
import com.expensetrackerapp.expensetracker.service.ExpenseService;
import com.expensetrackerapp.expensetracker.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/income")
public class IncomeController {
    @Autowired
    private IncomeService incomeService;
    @PostMapping("/addIncome")
    public String addExpense(@RequestBody Income income){
        incomeService.addIncome(income);
        return "Income added Successfully";

    }
    @GetMapping("getOne/{incomeId}")
    public Optional<Income> getExpense(@PathVariable Long incomeId){
        return incomeService.getIncomeById(incomeId);

    }
    @DeleteMapping("/deleteIncome/{incomeId}")
    public String deleteExpense(@PathVariable Long incomeId){
        incomeService.deleteIncome(incomeId);
        return "Income deleted Successfully";
    }
    @GetMapping("/getAllIncome")
    public List<Income> getAllExpense(){
        return incomeService.getAllIncome();
    }
    @PutMapping("/updateIncome/{incomeId}")
    public String updateIncome(@PathVariable Long incomeId,@RequestBody Income income){
        incomeService.updateIncome(incomeId,income);
        return "Income Updated successfully";
    }

}
