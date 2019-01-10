package com.designmodes.app.builder;

/**
 * 定义指挥者类（Director）：老板委派任务给装机人员
 */
public class Director {
    private Builder mBuilder;

    public Director(Builder mBuilder) {
        this.mBuilder = mBuilder;
    }

    //组装电脑
    public Builder construct(String cpu,String memonry,String HD){
        mBuilder.buildCpu(cpu);
        mBuilder.buildMemory(memonry);
        mBuilder.buildHD(HD);
        return mBuilder;
    }


}
