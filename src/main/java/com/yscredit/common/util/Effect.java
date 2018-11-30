package com.yscredit.common.util;

import com.yscredit.common.constants.Constant;

import java.io.Serializable;

/**
 * @author
 * @param <T>
 */
public class Effect<T> implements Serializable {


    private static final long serialVersionUID = 1L;
    /**
     * 返回码值,默认值Const.FAI
     */
    private int res= Constant.FAIL;
    /**
     * 返回码值解析
     */
    private String resMsg;
    /**
     * 返回对象
     */
    private Object obj;

    public int getRes() {
        return res;
    }
    public void setRes(int res) {
        this.res = res;
    }
    public String getResMsg() {
        return resMsg;
    }
    public void setResMsg(String resMsg) {
        this.resMsg = resMsg;
    }
    public Object getObj() {
        return obj;
    }
    public void setObj(Object obj) {
        this.obj = obj;
    }
    /**
     * 设置成功值
     * @param obj  设置对象
     * @param resMsg  设置码值解析
     */
    public void setSucceed(Object obj,String resMsg){
        this.setResMsg(resMsg);
        this.setSucceed(obj);
    }

    public void setFail(Object obj,String resMsg){
        this.setResMsg(resMsg);
        this.setObj(obj);
    }
    /**
     * 设置成功值
     * @param obj 设置对象
     */
    public void setSucceed(Object obj){
        this.obj = obj;
        this.setRes(Constant.SUCCEED);
    }
    /**
     * 设置成功值
     * @param resMsg 返回码值解析
     */
    public void setSucceedMsg(String resMsg){
        this.setRes(Constant.SUCCEED);
        this.setResMsg(resMsg);
    }
    /**
     * 设置失败值
     * @param resMsg 返回码值解析
     */
    public void setFailMsg(String resMsg){
        this.obj = null;
        this.setRes(Constant.FAIL);
        this.setResMsg(resMsg);
    }

}
