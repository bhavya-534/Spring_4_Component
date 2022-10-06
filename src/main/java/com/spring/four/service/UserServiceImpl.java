package com.spring.four.service;

import com.spring.four.model.User;
import com.spring.four.repository.UserRepository;
import com.spring.four.repository.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements  UserService{

    private UserRepository repository;

    // Constructor Injection
    @Autowired
    public UserServiceImpl(UserRepositoryImpl repository)
    {
        System.out.println("With the help of Constructor Injection");
        this.repository = repository;
    }

    public List<User> manipulateData() {
        System.out.println("Component is working...");
        return repository.findData();
    }

    // Setter Injection
    @Autowired
    public void setData(UserRepository repository)
    {
        System.out.println("With the help of Setter Injection");
        this.repository=repository;
    }
}
