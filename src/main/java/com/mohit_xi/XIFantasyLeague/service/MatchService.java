package com.mohit_xi.XIFantasyLeague.service;

import com.mohit_xi.XIFantasyLeague.config.FootballApiProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import com.mohit_xi.XIFantasyLeague.dto.MatchResponse;

@Service
@RequiredArgsConstructor
public class MatchService {

    private final WebClient footballApiClient;
    private final FootballApiProperties footballApiProperties;

    public MatchResponse getAllPLMatches(){
        return footballApiClient.get()
                .uri("/competitions/PL/matches")
                .header("X-Auth-Token", footballApiProperties.getKey())
                .retrieve()
                .bodyToMono(MatchResponse.class)
                .block();
    }
}
