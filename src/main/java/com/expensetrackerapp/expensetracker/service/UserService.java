package com.expensetrackerapp.expensetracker.service;

import com.expensetrackerapp.expensetracker.model.Expense;
import com.expensetrackerapp.expensetracker.model.User;
import com.expensetrackerapp.expensetracker.reposotory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public void addUser(User user){
        userRepository.save(user);
    }
    public Optional<User> getUserById(Long userId){
        Optional<User> user= userRepository.findById(userId);
        if (user.isEmpty()){
            return null;
        }
        return user;
    }
    public List<User> getAllUser(){
       return userRepository.findAll();
    }
    public void updateUser(Long userId, User user){
        Optional<User> user1=userRepository.findById(userId);
        if(user1.isPresent()){
            User user2=user1.get();
            user2.setEmail(user.getEmail());
            user2.setLastName(user.getLastName());
            user2.setFirstName(user.getFirstName());
            user2.setPassword(user.getPassword());
            userRepository.save(user2);
        }
    }
    public void deleteUser(Long userId){
        userRepository.deleteById(userId);

    }
}
