package com.skysthelimit.aws.awscicdbeanstalk;

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
        String t = dateFormat.format(new Date());

        String msg = "<body bgcolor=\"#FFA07A\">"
                + "<img src=\"https://cdn-images-1.medium.com/max/1200/1*jMQ9lkY5SBnbcOlJB4aizg.png\" "
                + "alt=\"AWS Codebuild\" width=\"240\" height=\"100\">"
                + "<img src=\"https://www.cloudaxis.com/wp-content/uploads/2018/09/codebuild.png\" "
                + "alt=\"AWS Codebuild\" width=\"120\" height=\"100\">"
                + "<img src=\"https://cdn-images-1.medium.com/max/1600/1*6B-6_az43jpZIalwbsuoQw.png\" "
                + "alt=\"Elastic Beanstalk\" width=\"110\" height=\"100\">"
                + "<img src=\"https://noticiasseguridad.com/nsnews_u/2019/04/tomcat.png\" "
                + "alt=\"Apache Tomcat\" width=\"190\" height=\"100\">" + "<br>" + "<font size=\"7\">"
                + "***** INTEGRATION ... Added feature 7.  If approved, promote -> to PROD ****  CodePipeline with CI/CD for Tomcat Java App deployed via Elastic Beanstalk"
                + "</font>" + "<br>" + "<font size=\"6\">" + "The current UTC time is: " + "<b>" + t + "</b>"
                + "</font>";

        return msg;
    }
}
