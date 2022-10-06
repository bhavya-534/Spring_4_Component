package com.spring.four.repository;

import com.spring.four.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository{

    public List<User> findData() {

        List<User> list = new ArrayList<User>();
        User user1 = new User("Bhavya","Ch");
        User user2 = new User("Saiki","M");

        list.add(user1);
        list.add(user2);
        return list;
    }
}
