package com.nayk.growthdiary.goal.dto;

public record GoalRequest (
        String content,
        Long diary_id,
        Long userTry
){
}
