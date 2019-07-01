package com.example.startproject.frament;



/**
 * Created by 任小龙 on 2019/6/27.
 */
public class CommonPresenter extends BasePresenter implements ICommonPresenter, ICommonView {

    @Override
    public void getData(int whichApi, Object... t) {
        getModel().getData(this, whichApi,t);
    }

    @Override
    public void onError(int whichApi, Throwable e) {
        getView().onError(whichApi, e);
    }

    @Override
    public void onResponse(int whichApi, Object[] t) {
        getView().onResponse(whichApi, t);
    }
}
