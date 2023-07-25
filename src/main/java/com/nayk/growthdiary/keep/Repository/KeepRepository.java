package com.nayk.growthdiary.keep.Repository;

import com.nayk.growthdiary.keep.Keep;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KeepRepository extends JpaRepository<Keep, Long> {
}
