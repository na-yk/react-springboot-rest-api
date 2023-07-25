package com.nayk.growthdiary.goal.service;

import com.nayk.growthdiary.diary.repository.DiaryRepository;
import com.nayk.growthdiary.goal.dto.GoalRequest;
import com.nayk.growthdiary.goal.repository.GoalRepository;
import com.nayk.growthdiary.usertry.repository.UserTryRepository;

public class GoalServiceImpl implements GoalService {

    GoalRepository goalRepository;
    DiaryRepository diaryRepository;
    UserTryRepository userTryRepository;
    public Long create(GoalRequest request) {
    }
}
