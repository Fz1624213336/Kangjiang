package com.example.startproject.frament;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.LinearLayout;

import com.example.startproject.utils.NormalConfig;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import static com.scwang.smartrefresh.layout.util.DensityUtil.px2dp;

/**
 * Created by 方小茗 on 2019/6/27.
 */

public class BaseActivaty extends AppCompatActivity {
    private LinearLayoutManager mManager;
    public Application10 mApplication;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //打印当前页面类名
        showLog("我就是一个类："+this.getClass().getSimpleName());
        mApplication = (Application10) getApplication();
    }
    public void showLog(String content){
        Log.e(NormalConfig.log1,content);
    }
    public void showLog(boolean content){
        Log.e(NormalConfig.log1,""+content );
    }
    public void initRecycleView(RecyclerView recyclerView, RefreshLayout refreshLayout){
        mManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mManager);
        if(refreshLayout!=null){
            refreshLayout.setHeaderHeight(px2dp(120));
            refreshLayout.setFooterHeight(px2dp(100));
            refreshLayout.setOnRefreshListener(new OnRefreshListener() {
                @Override
                public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                    refresh();
                }
            });
            refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
                @Override
                public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                    loadMore();
                }
            });
        }
    }
    protected int getLoadType(Object[] t){
        return (int)((Object[])t[1])[0];
    }
    public void refresh(){

    }
    public void loadMore(){

    }
}
