package com.sjk.domain;

import lombok.ToString;

//userName 필드를 제외하는 toString()메서드를 생성한다.
@ToString(exclude = "userName")
public class Member {

    private String userId;
    private String password;
    private String userName;

    //@ToString에 의해 추가된 코드, exclude 파라미터에 지정된 userName필드값은 출력하지 않는다.
    @Override
    public String toString(){
        return "Member(userId="+userId+", password="+password+")";
    }
}
