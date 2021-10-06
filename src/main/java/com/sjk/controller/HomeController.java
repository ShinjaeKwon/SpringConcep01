package com.sjk.controller;

import lombok.extern.java.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

@Log
@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = "/")
    public String home(Locale locale, Model model){
        log.info("Welcome home! The client locale is "+ locale + ".");

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);

        model.addAttribute("serverTime", formattedDate);

        return "home";
    }

    @RequestMapping(value = "/formHome", method = RequestMethod.GET)
    public String formHome(){
        return "formHome";
    }
}
