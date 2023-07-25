package com.nayk.growthdiary.usertry.repository;

import com.nayk.growthdiary.usertry.UserTry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTryRepository extends JpaRepository<UserTry, Long> {
}
