package com.irina197.tinder1.service.database.impl;

import com.irina197.tinder1.entity.User;
import com.irina197.tinder1.repository.impl.UserRepository;
import com.irina197.tinder1.service.database.UsersDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class UsersDatabaseRealServiceImpl implements UsersDatabaseService {

        @Autowired
        private UserRepository userRepository;

        @Override
        public List<User> getUserList() {
            System.out.println(userRepository.getUserByName("Aleksandr"));
            return userRepository.findAll();
        }
    }


