package com.nayk.growthdiary.diary.dto;

public record DiaryResponse(
        Long id,
        String content,
        String createdAt,
        String updatedAt
) {
}
