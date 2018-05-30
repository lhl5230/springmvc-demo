package com.vppn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hongliang.liu on 2018/5/28.
 */
@Controller
@RequestMapping(value = "/api")
public class MainController {
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String welcome() {
        return "hello world main controller";
    }
}
