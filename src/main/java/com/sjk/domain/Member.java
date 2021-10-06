package com.sjk.domain;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@RequiredArgsConstructor
public class Member {

    private final String userId;
    private final String password;
    private String userName;

}
