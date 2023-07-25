package com.nayk.growthdiary.diary.repository;

import com.nayk.growthdiary.diary.Diary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiaryRepository extends JpaRepository<Diary, Long> {
}
