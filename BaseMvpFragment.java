package com.example.startproject.frament;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by 方小茗 on 2019/6/29.
 */

public abstract class BaseMvpFragment<M> extends Basefragment implements ICommonView{
    private Unbinder mBind;
    public CommonPresenter mPresenter;
    public M mModel;
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(getLayoutId(), container,false);
        mBind= ButterKnife.bind(this,inflate);
        mPresenter = getPresenter();
        mModel = getModel();
        if (mPresenter != null) mPresenter.attach(this, (ICommonModel) mModel);
        initView();
        initData();
        return inflate;
    }
    public abstract int getLayoutId();

    public abstract void initView();

    public abstract void initData();

    public CommonPresenter getPresenter(){
        return new CommonPresenter();
    }

    public abstract M getModel();

    @Override
    public void onDestroy() {
        super.onDestroy();
        mBind.unbind();
        mPresenter.detach();
    }

    public void netErrorToast(Throwable e) {
        Toast.makeText(getContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
    }

}
