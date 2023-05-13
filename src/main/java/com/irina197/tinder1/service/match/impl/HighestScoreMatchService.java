package com.irina197.tinder1.service.match.impl;

import com.irina197.tinder1.entity.User;
import com.irina197.tinder1.service.database.UsersDatabaseService;
import com.irina197.tinder1.service.match.MatchService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HighestScoreMatchService implements MatchService {


    private UsersDatabaseService usersDatabaseService;

    public HighestScoreMatchService(UsersDatabaseService usersDatabaseService) {
        this.usersDatabaseService = usersDatabaseService;
    }

    @Override
    public User getNewMatch() {
        List<User> users = usersDatabaseService.getUserList();
        int maxPoint = 0;
        User highestRangUser = null;

        for (User user : users) {
            if (user.getPoints() > maxPoint) {
                maxPoint = user.getPoints();
                highestRangUser = user;
            }
        }

        return highestRangUser;
        }
    }