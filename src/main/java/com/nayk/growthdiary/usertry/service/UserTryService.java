package com.nayk.growthdiary.usertry.service;

import com.nayk.growthdiary.usertry.dto.UserTryRequest;

public interface UserTryService {
    Long create(UserTryRequest request);
}
