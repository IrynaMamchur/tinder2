package com.irina197.tinder1.repository.impl;

import com.irina197.tinder1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User getUserByName(String name);
}
