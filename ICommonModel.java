package com.example.startproject.frament;

/**
 * Created by 方小茗 on 2019/6/27.
 */

public interface ICommonModel<T> {
    void getData(ICommonView view,int whichApi, T...t);
}
