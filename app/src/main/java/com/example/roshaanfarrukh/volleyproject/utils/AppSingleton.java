package com.example.roshaanfarrukh.volleyproject.utils;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by Roshaan Farrukh on 1/11/2018.
 */

public class AppSingleton {
    private static AppSingleton mAppSingletonInstance;
    private RequestQueue mRequestQueue;
    private static Context mContext;

    private AppSingleton(Context context){

        mContext=context;
        mRequestQueue=getRequestQueue();
    }

    public RequestQueue getRequestQueue(){

        if(mRequestQueue==null){
            //it will make thre request queue alive for whole application lifecycle
            mRequestQueue= Volley.newRequestQueue(mContext.getApplicationContext());
        }
        return mRequestQueue;
    }

    public static synchronized AppSingleton getInstance(Context context){

        if(mAppSingletonInstance==null){
            mAppSingletonInstance=new AppSingleton(context);
        }
        return mAppSingletonInstance;
    }

    public <T> void addToRequestQueue(Request<T> request){
        mRequestQueue.add(request);
    }
}
