package com.nayk.growthdiary.keep;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Keep {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private KeepStatus status;
}
