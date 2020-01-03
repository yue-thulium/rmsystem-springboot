package com.wuyue.rmsystem.model;

import java.io.Serializable;

/**
 * 菜单动态表
 * 用于标识是否可用
 * （印象中是的）
 */
public class MenuMeta implements Serializable {

    private boolean keepAlive;
    private boolean requireAuth;

    public boolean isKeepAlive() {
        return keepAlive;
    }

    public void setKeepAlive(boolean keepAlive) {
        this.keepAlive = keepAlive;
    }

    public boolean isRequireAuth() {
        return requireAuth;
    }

    public void setRequireAuth(boolean requireAuth) {
        this.requireAuth = requireAuth;
    }
}
