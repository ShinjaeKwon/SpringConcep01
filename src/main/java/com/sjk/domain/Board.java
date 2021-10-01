package com.sjk.domain;

import lombok.*;

import java.util.Date;


@Getter
@Setter
@ToString
@EqualsAndHashCode(of="boardNo")
public class Board{

    private int boardNo;
    private String title;
    private String content;
    private String writer;
    private Date regDate;
}
