package com.nayk.growthdiary.goal;

import com.nayk.growthdiary.BaseEntity;
import com.nayk.growthdiary.diary.Diary;
import com.nayk.growthdiary.usertry.UserTry;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Goal extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDate startAt;
    private LocalDate endAt;

    private boolean isAchieved;

    @ManyToOne
    @JoinColumn(name = "diary_id")
    private Diary diary;

    @OneToOne
    @JoinColumn(name = "try_id")
    private UserTry userTry;
}
