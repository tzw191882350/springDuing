package com.duing.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * hellow world controller
 */
//@Controller
@RestController
public class HellowController {

    /**
     * @Param []
     * @return java.lang.String
     */
    @RequestMapping("/hellow")
    public String hellow() {
        return "index";
    }
}
