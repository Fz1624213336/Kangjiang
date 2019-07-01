package com.example.startproject.frament;




import com.example.startproject.bean.Dierceframent;

import com.example.startproject.bean.HeadLineTwoData;
import com.example.startproject.bean.Hotbean;
import com.example.startproject.bean.InsDataInfo;
import com.example.startproject.bean.NavigationViewInfo;
import com.example.startproject.bean.Zhuanbean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by 任小龙 on 2019/6/27.
 */
public interface INetService {
    @GET()
    Observable<Dierceframent> getLeftMenuInfo(@Url String url);
    @GET()
    Observable<Hotbean> getHot(@Url String url);
    @GET()
    Observable<Zhuanbean> getZhuan(@Url String url);
    @GET()
    Observable<HeadLineTwoData> getHander(@Url String url);
    @GET("")
    Observable<NavigationViewInfo> getNavigationViewData(@Url() String url);

    @GET("")
    Observable<InsDataInfo> getInsData(@Url() String url);
//    @GET()
//    Observable<LevelAndRoundInfo> getLevelInfo(@Url String url);
}
