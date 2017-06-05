package com.ryanplant.experiments;

/**
 * Created by RP on 6/5/2017.
 */
public class MyType {

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    private String errorCode;

    public MyType(String errorCode) {
        this.errorCode = errorCode;
    }

}
