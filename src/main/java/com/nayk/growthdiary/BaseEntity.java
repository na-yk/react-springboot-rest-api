package com.nayk.growthdiary;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@MappedSuperclass
public class BaseEntity {
    @Column(name = "created_at")
    private final LocalDateTime createdAt;
    
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public BaseEntity() {
        createdAt = LocalDateTime.now();
    }
}
