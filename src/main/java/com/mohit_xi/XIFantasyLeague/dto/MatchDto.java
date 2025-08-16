package com.mohit_xi.XIFantasyLeague.dto;

import lombok.Data;

@Data
public class MatchDto {
    private Long id;
    private String utcDate;
    private String status;
    private TeamDto homeTeam;
    private TeamDto awayTeam;
    private ScoreDto score;
}
