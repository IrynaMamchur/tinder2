package com.irina197.tinder1.service.database.impl;

import com.irina197.tinder1.entity.Sex;
import com.irina197.tinder1.entity.User;
import com.irina197.tinder1.service.database.UsersDatabaseService;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.List;

@Component
public class UsersDatabaseFileServiceImpl implements UsersDatabaseService {
    private List<User> userList;

    {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/users.txt"))) {
            String usersString = "";
            while ((usersString = bufferedReader.readLine()) != null) {
                if (usersString != null) {
                    String[] data = usersString.split(", ");
                    int id = Integer.parseInt(data[0]);
                    String name = data[1];
                    Sex sex = Sex.valueOf(data[2]);
                    int points = Integer.parseInt(data[3]);
                    User user = new User(id, name, sex, points);
                    user.add(user);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public List<User> getUserList() {
        return userList;
    }

}


