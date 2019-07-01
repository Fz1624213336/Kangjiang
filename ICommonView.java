package com.example.startproject.frament;

/**
 * Created by 方小茗 on 2019/6/27.
 */

public interface ICommonView <T>{
    void onError(int whichApi, Throwable e);
    void onResponse(int whichApi,T... t);
}
