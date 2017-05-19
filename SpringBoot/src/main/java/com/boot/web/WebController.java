package com.boot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by snlu on 2017/5/16.
 */
@Controller
@RequestMapping("/web")
public class WebController {

    @RequestMapping("/test")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}

