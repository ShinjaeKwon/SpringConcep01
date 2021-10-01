package com.sjk.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
//자바의 equals() 메서드와 hashCode() 메서드를 생서한다.
@EqualsAndHashCode(of="studentNo")
public class Student {

    private int studentNo;
    private String name;

}
