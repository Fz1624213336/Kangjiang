package com.example.startproject.frament;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by 方小茗 on 2019/6/28.
 */

public abstract class BaseMvpActivity<M> extends BaseActivaty implements ICommonView{

    private Unbinder mBind;
    public CommonPresenter mPresenter;
    public M mModel;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        mBind = ButterKnife.bind(this);
        mPresenter = getPresenter();
        mModel = getModel();
        if (mPresenter != null) mPresenter.attach(this, (ICommonModel) mModel);
        initView();
        initData();
    }

    public abstract int getLayoutId();

    public abstract void initView();

    public abstract void initData();

    public CommonPresenter getPresenter(){
        return new CommonPresenter();
    }

    public abstract M getModel();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mBind.unbind();
        mPresenter.detach();
    }

    public void netErrorToast(Throwable e) {
        Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
    }
}
