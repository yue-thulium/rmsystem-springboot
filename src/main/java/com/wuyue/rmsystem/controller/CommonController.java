package com.wuyue.rmsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 公共的Controller
 * 用于对一些不明确分类的请求进行处理
 */
@Controller
public class CommonController {
    /**
     * 给index.html一个转发
     * @return
     */
    @RequestMapping("/")
    public String index(){
        return "/index";
    }
}
