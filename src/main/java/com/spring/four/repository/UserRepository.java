package com.spring.four.repository;

import com.spring.four.model.User;

import java.util.List;

public interface UserRepository {

    List<User> findData();
}
