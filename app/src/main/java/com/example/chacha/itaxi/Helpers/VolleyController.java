package com.example.chacha.itaxi.Helpers;

import android.app.Application;
import android.text.TextUtils;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by chacha on 07/08/2017.
 */


public class VolleyController extends Application {
    public  static  final  String TAG=VolleyController.class.getSimpleName();

    private RequestQueue mRequestQueue;
    private static VolleyController mInstance;


    @Override
    public void onCreate() {
        super.onCreate();
        mInstance=this;
    }

    public  synchronized VolleyController getInstance(){
        return mInstance;
    }

    public RequestQueue getRequestQueue(){

        if (mRequestQueue==null){
            mRequestQueue= Volley.newRequestQueue(getApplicationContext());
        }
        return mRequestQueue;
    }
    public <T> void addToRequestQueue(Request<T> req, String tag){
        req.setTag(TextUtils.isEmpty(tag) ? TAG : tag);
        getRequestQueue().add(req);
    }
    public <T> void addToRequestQueue(Request<T> req){
        req.setTag(TAG);
        getRequestQueue().add(req);
    }
    public void cancelPendingRequests(Object tag){
        if (mRequestQueue!=null){
            mRequestQueue.cancelAll(tag);
        }
    }
}
