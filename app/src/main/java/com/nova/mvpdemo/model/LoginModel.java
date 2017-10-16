package com.nova.mvpdemo.model;

import com.nova.mvpdemo.listener.OnLoginFinishedListener;

/**
 * Created by Administrator on 2017/10/12 0012.
 */

public interface LoginModel {
    void login(String username,String password,OnLoginFinishedListener listener);
}
