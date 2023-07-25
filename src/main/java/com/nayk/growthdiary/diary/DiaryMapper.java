package com.nayk.growthdiary.diary;

import com.nayk.growthdiary.diary.dto.DiaryRequest;
import com.nayk.growthdiary.diary.dto.DiaryResponse;

public class DiaryMapper {
    public DiaryMapper() {
    }

    public static Diary convertRequestToEntity(DiaryRequest request){
        return Diary.builder()
                .content(request.content())
                .build();
    }

    public static DiaryResponse convertEntityToResponse(Diary diary) {

        return new DiaryResponse(diary.getId(), diary.getContent(), diary.getCreatedAt().toString(), diary.getUpdatedAt().toString());

    }
}
