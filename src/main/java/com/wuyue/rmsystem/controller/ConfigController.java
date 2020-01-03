package com.wuyue.rmsystem.controller;

import com.wuyue.rmsystem.common.RmUtils;
import com.wuyue.rmsystem.mapper.RmMapper;
import com.wuyue.rmsystem.model.Menu;
import com.wuyue.rmsystem.model.Rm;
import com.wuyue.rmsystem.service.MenuService;
import com.wuyue.rmsystem.service.RmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 这是一个只要登录就能访问的Controller
 * 主要用来获取一些配置信息
 * （用户菜单显示）
 */
@RestController
@RequestMapping("/config")
public class ConfigController {

    @Autowired
    MenuService menuService;

    @Autowired
    RmService rmService;

    /**
     * 获取用户对应权限的菜单配置
     * @return
     */
    @RequestMapping("/sysmenu")
    public List<Menu> sysmenu() {
        return menuService.getMenusByHrId();
    }

    /**
     * 通过RmUtiles获取用户ID
     * @return
     */
    @RequestMapping("/rm")
    public Rm currentUser() {
        return RmUtils.getCurrentRm();
    }

    /**
     * 用于用户注册
     * @return
     */
    @RequestMapping(value = "/doRegister", method = RequestMethod.POST)
    public String register(HttpServletRequest request) {
        Rm rm =new Rm();
        String name = request.getParameter("name");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String role = request.getParameter("role");
        rm.setName(name);
        rm.setUsername(username);
        rm.setPassword(password);
        rmService.addRm(rm,role);
        return rm == null ? "注册失败" : "注册成功";
    }
}
