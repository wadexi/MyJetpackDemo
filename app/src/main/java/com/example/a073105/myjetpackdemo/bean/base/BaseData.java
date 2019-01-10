package com.example.a073105.myjetpackdemo.bean.base;

public class BaseData {

    private int errNo;
    private String errMsg;

    public int getErrNo() {
        return errNo;
    }

    public void setErrNo(int errNo) {
        this.errNo = errNo;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    @Override
    public String toString() {
        return "BaseData{" +
                "errNo=" + errNo +
                ", errMsg='" + errMsg + '\'' +
                '}';
    }
}
