package com.mohit_xi.XIFantasyLeague.controller;

import com.mohit_xi.XIFantasyLeague.dto.MatchResponse;
import com.mohit_xi.XIFantasyLeague.service.MatchService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/match")
@RequiredArgsConstructor
public class MatchController {

    private final MatchService matchService;

    @GetMapping("/getAllPLMatches")
    public MatchResponse getAllPLMatches(){
        return matchService.getAllPLMatches();
    }
}
