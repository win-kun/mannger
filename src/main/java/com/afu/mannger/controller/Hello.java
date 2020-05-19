package com.afu.mannger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@Controller
public class Hello {
    @RequestMapping("hello")
   public String hello() {
       return "hello,Spring boot";
   }
}

