package com.wuyue.rmsystem.controller;

import com.wuyue.rmsystem.model.RespBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 公共的RestController
 * 用于对一些不明确分类的请求进行处理
 */
@RestController
public class CommonRestController {

    /**
     * 未登录返回
     * @return
     */
    @RequestMapping("/login_p")
    public RespBean login() {
        return RespBean.error("尚未登录，请登录!");
    }
}
