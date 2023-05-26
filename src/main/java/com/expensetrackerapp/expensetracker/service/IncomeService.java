package com.expensetrackerapp.expensetracker.service;

import com.expensetrackerapp.expensetracker.model.Expense;
import com.expensetrackerapp.expensetracker.model.Income;
import com.expensetrackerapp.expensetracker.reposotory.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IncomeService {
    @Autowired
    private IncomeRepository incomeRepository;
    public void addIncome(Income income){
        incomeRepository.save(income);
    }
    public Optional<Income> getIncomeById(Long incomeId){
        return incomeRepository.findById(incomeId);

    }
    public void deleteIncome(Long incomeId){
        incomeRepository.deleteById(incomeId);

    }
    public void updateIncome(Long incomeId, Income income){
        Optional<Income> income1=incomeRepository.findById(incomeId);
        if(income1.isPresent()){
            Income income2=income1.get();
            income2.setIncomeSource(income.getIncomeSource());
            income2.setAmount(income.getAmount());
            income2.setDescription(income.getDescription());
            income2.setUserId(income.getUserId());
            income2.setDate(income.getDate());
            incomeRepository.save(income2);

        }
    }
    public List<Income> getAllIncome(){
        return  incomeRepository.findAll();
    }

}
