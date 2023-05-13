package com.expensetrackerapp.expensetracker.service;

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
    public List<Income> getAllIncome(){
        return  incomeRepository.findAll();
    }

}
