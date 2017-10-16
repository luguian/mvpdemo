package com.nova.mvpdemo.model;

import android.os.Handler;
import android.text.TextUtils;

import com.nova.mvpdemo.listener.OnLoginFinishedListener;

import java.io.Serializable;


/**
 * Created by Administrator on 2017/10/12 0012.
 */

public class LoginModelImpl implements LoginModel,Serializable {
    private static final long serialVersionUID = -7060210544600464481L;
    @Override
    public void login(final String username, final String password, final OnLoginFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                boolean error = false;
                if (TextUtils.isEmpty(username)){
                    listener.onUsernameError();//model层里面回调listener
                    error = true;
                }
                if (TextUtils.isEmpty(password)){
                    listener.onPasswordError();
                    error = true;
                }
                if (!error){
                    listener.onSuccess();
                }
            }
        }, 2000);
    }

}
