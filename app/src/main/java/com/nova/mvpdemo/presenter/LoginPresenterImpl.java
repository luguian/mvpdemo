package com.nova.mvpdemo.presenter;

import com.nova.mvpdemo.listener.OnLoginFinishedListener;
import com.nova.mvpdemo.model.LoginModel;
import com.nova.mvpdemo.model.LoginModelImpl;
import com.nova.mvpdemo.view.LoginView;

/**
 * Created by Administrator on 2017/10/12 0012.
 */

public class LoginPresenterImpl implements LoginPresenter,OnLoginFinishedListener{
    private LoginView loginView;
    private LoginModel loginModel;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        this.loginModel = new LoginModelImpl();
    }
    @Override
    public void validateCredentials(String username, String password) {
        if (loginView != null) {
            loginView.showProgress();
        }

        loginModel.login(username, password, this);
    }

    @Override
    public void onDestroy() {
        loginView = null;
    }

    @Override
    public void onUsernameError() {
        if (loginView != null) {
            loginView.setUsernameError();
            loginView.hideProgress();
        }
    }

    @Override
    public void onPasswordError() {
        if (loginView != null) {
            loginView.setPasswordError();
            loginView.hideProgress();
        }
    }

    @Override
    public void onSuccess() {
        if (loginView != null) {
            loginView.navigateToHome();
        }
    }
}
