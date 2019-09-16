package com.wzb.moredb.moredbtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: moredb
 * @description:
 * @author: wangzibin
 * @create: 2019-09-16 18:26
 **/
@RestController
@RequestMapping("/word")
public class HelloWord {

    @GetMapping("/hello")
    public String hello(){
        return "helloWord!!";
    }
}

