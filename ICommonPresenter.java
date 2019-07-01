package com.example.startproject.frament;

/**
 * Created by 方小茗 on 2019/6/27.
 */

public interface ICommonPresenter<T> {
    void getData(int whichApi, T... t);
}
