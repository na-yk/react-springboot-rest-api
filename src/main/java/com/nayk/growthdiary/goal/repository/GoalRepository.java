package com.nayk.growthdiary.goal.repository;

import com.nayk.growthdiary.goal.Goal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoalRepository extends JpaRepository<Goal, Long> {
}
