package com.nova.mvpdemo.listener;

/**
 * Created by Administrator on 2017/10/12 0012.
 */

public interface OnLoginFinishedListener {
    void onUsernameError();
    void onPasswordError();
    void onSuccess();
}
