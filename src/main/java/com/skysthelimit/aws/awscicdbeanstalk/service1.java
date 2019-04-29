package com.skysthelimit.aws;

import java.util.Date;
import java.text.SimpleDateFormat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/service1")
@RestController
public class service1 {

    @GetMapping
    public String handle_service1() {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");
        String t  = dateFormat.format(new Date());

        String msg =         
            "<font size=\"7\">" +
            "Testing CodePipeline with CI/CD for Tomcat Java App deployed via Elastic Beanstalk" + 
            "</font>" +
            "<br>" +
            "<font size=\"6\">" +
            "The current UTC time is: " + "<b>" + t + "</b>" + 
            "</font>" ;

        return msg;
    }
}
