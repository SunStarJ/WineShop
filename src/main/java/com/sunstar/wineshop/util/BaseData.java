package com.sunstar.wineshop.util;

class BaseData<T>{
    T data;
    int code = 0;
    String msg = "";

    public BaseData(T data) {
        this.data = data;
    }

    public static <T> BaseData<T>  success(T data){
        return new BaseData(data);
    }

    public static BaseData error(int code, String msg){
        BaseData baseData = new BaseData(null);
        baseData.code = code;
        baseData.msg = msg;
        return baseData;
    }

}