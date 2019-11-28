package com.jzhl.plate.bean;

/**
 * api通用返回类
 *
 * @author 陈龙
 */
public class BaseResult {

    public BaseResult(String status, String msg, Object data){
        this.status = status;
        this.msg = msg;
        this.data  = data;
    }

    /**
     * 0 错误
     * 1 成功
     * -1 token失效
     * -2
     */
    private String status;

    private String msg;

    private Object data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
