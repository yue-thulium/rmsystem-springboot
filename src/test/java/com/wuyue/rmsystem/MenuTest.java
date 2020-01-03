package com.wuyue.rmsystem;

import com.wuyue.rmsystem.model.Menu;
import com.wuyue.rmsystem.service.MenuService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created on 2020/1/3.
 *
 * @author Yue Wu
 */
public class MenuTest {

    @Autowired
    MenuService menuService;

    @Test
    public void getAll() {
        List<Menu> menus = menuService.getAllMenu();
        for (Menu menu : menus) {
            System.out.println(menu);
        }
    }
}
