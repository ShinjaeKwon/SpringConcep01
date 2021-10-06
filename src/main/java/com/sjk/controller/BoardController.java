package com.sjk.controller;


import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Log
@Controller
@RequestMapping("/board")
public class BoardController {

    // /register 경로에 GET 방식
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerForm(){
        log.info("registerForm");

        return "success";
    }

    // /register 경로에 POST 방식
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(){
        log.info("register");

        return "success";
    }


    // /modify 경로에 GET 방식
    @RequestMapping(value = "/modify", method = RequestMethod.GET)
    public String modifyForm(){
        log.info("modify");

        return "success";
    }

    // /modify 경로에 POST 방식
    @RequestMapping(value = "/modify", method = RequestMethod.POST)
    public String modify(){
        log.info("remove");

        return "success";
    }

    // /list 경로에 GET 방식
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(){
        log.info("list");

        return "success";
    }

    //경로 패턴 지정
    @RequestMapping("/read/{boardNo}")
    public String read(@PathVariable("boardNo") int boardNo){
        log.info("read boardNo : "+boardNo);

        //경로가 변하므로 뷰 이름 지정
        return "board/read";
    }


}
