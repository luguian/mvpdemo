package com.nova.mvpdemo.presenter;

/**
 * Created by Administrator on 2017/10/12 0012.
 */

public interface LoginPresenter {
    void validateCredentials(String username, String password);

    void onDestroy();
}
