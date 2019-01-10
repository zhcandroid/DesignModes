package com.designmodes.app.builder;

/**
 * 将要生产的产品 对象
 */
public class Computer {

    private String mCPU;
    private String mMemory;
    private String mHD;

    public void setmCPU(String mCPU) {
        this.mCPU = mCPU;
    }

    public void setmMemory(String mMemory) {
        this.mMemory = mMemory;
    }

    public void setmHD(String mHD) {
        this.mHD = mHD;
    }

    public String getmCPU() {
        return mCPU;
    }

    public String getmMemory() {
        return mMemory;
    }

    public String getmHD() {
        return mHD;
    }
}
