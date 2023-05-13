package com.irina197.tinder1.controller;

import com.irina197.tinder1.entity.User;
import com.irina197.tinder1.service.match.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TinderController {

    private MatchService matchService;

    @Autowired
    public TinderController(MatchService matchService) {
        this.matchService = matchService;
    }

    @GetMapping(value = "/new-match")
    public User getNewMatch() {
        return matchService.getNewMatch();
    }
}
