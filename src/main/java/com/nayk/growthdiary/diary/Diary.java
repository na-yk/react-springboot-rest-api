package com.nayk.growthdiary.diary;

import com.nayk.growthdiary.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.aspectj.lang.annotation.control.CodeGenerationHint;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
public class Diary extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String content;

    @Builder
    public Diary(String content) {
        this.content = content;
    }


}
