package com.nova.mvpdemo.view;

/**
 * Created by Administrator on 2017/10/12 0012.
 */

public interface LoginView {
    void showProgress();

    void hideProgress();

    void setUsernameError();

    void setPasswordError();

    void navigateToHome();
}
