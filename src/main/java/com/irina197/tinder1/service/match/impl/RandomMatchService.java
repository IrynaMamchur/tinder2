package com.irina197.tinder1.service.match.impl;

import com.irina197.tinder1.entity.User;
import com.irina197.tinder1.service.database.UsersDatabaseService;
import com.irina197.tinder1.service.match.MatchService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
@Primary
public class RandomMatchService implements MatchService {

    private UsersDatabaseService usersDatabaseService;

    public RandomMatchService(UsersDatabaseService usersDatabaseService) {
        this.usersDatabaseService = usersDatabaseService;
    }

    @Override
    public User getNewMatch() {
        List<User> users = usersDatabaseService.getUserList();
        Random random = new Random();
        int i = random.nextInt(users.size());
        return users.get(i);
    }

}