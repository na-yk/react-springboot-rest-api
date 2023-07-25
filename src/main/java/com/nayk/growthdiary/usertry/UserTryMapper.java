package com.nayk.growthdiary.usertry;

import com.nayk.growthdiary.usertry.dto.UserTryRequest;
import com.nayk.growthdiary.usertry.dto.UserTryResponse;

public class UserTryMapper {
    public static UserTry convertRequestToEntity(UserTryRequest request){
        return UserTry.builder()
                .content(request.content())
                .build();
    }

    public static UserTryResponse convertEntityToResponse(UserTry userTry){
        return new UserTryResponse(userTry.getContent());
    }
}
