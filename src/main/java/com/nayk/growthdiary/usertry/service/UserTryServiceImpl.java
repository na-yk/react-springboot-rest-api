package com.nayk.growthdiary.usertry.service;

import com.nayk.growthdiary.usertry.UserTry;
import com.nayk.growthdiary.usertry.UserTryMapper;
import com.nayk.growthdiary.usertry.dto.UserTryRequest;
import com.nayk.growthdiary.usertry.repository.UserTryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class UserTryServiceImpl implements UserTryService {

    UserTryRepository userTryRepository;

    public UserTryServiceImpl(UserTryRepository userTryRepository) {
        this.userTryRepository = userTryRepository;
    }

    public Long create(UserTryRequest request) {
        UserTry userTry = UserTryMapper.convertRequestToEntity(request);
        userTryRepository.save(userTry);
        return userTry.getId();
    }
}
