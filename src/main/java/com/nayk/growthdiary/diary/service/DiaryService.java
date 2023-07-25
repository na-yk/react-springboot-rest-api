package com.nayk.growthdiary.diary.service;

import com.nayk.growthdiary.diary.dto.DiaryRequest;
import com.nayk.growthdiary.diary.dto.DiaryResponse;

import java.util.List;

public interface DiaryService {

    Long create(DiaryRequest request);

    DiaryResponse findDiaryById(Long id);

    List<DiaryResponse> findDiaries();

    DiaryResponse update(DiaryRequest request);

    void delete(Long id);
}

