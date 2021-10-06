package com.sjk.domain;

import lombok.*;

import java.util.Date;

@ToString
@Builder
public class Board{

    private int boardNo;
    private String title;
    private String content;
    private String writer;
    private Date regDate;


}
