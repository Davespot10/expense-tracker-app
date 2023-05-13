package com.expensetrackerapp.expensetracker.controller;

import com.expensetrackerapp.expensetracker.model.Income;
import com.expensetrackerapp.expensetracker.model.User;
import com.expensetrackerapp.expensetracker.service.IncomeService;
import com.expensetrackerapp.expensetracker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/addUser")
    public String addExpense(User user){
        userService.addUser(user);
        return "User added Successfully";

    }
    @GetMapping("getOne/{userId}")
    public Optional<User> getExpense(Long userId){
        return userService.getUserById(userId);

    }
    @DeleteMapping("/deleteUser")
    public String deleteExpense(Long userId){
        userService.deleteUser(userId);
        return "User deleted Successfully";
    }
    @GetMapping("/getAllUser")
    public List<User> getAllExpense(){
        return userService.getAllUser();
    }
}
