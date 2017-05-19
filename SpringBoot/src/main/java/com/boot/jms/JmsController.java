package com.boot.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by snlu on 2017/5/19.
 */
@Controller
@RequestMapping(value = "/jms")
public class JmsController {

    @Autowired
    private Producter producter;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        producter.send("snlu spring boot mq test");
        return "success";
    }
}
