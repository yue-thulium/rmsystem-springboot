package com.wuyue.rmsystem.common;

import com.wuyue.rmsystem.model.Rm;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * 用以获取登录表RM用户信息
 */
public class RmUtils {

    public static String code = "1222";

    public static Rm getCurrentRm() {
        return (Rm) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
