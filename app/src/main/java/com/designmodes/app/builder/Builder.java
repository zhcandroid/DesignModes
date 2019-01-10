package com.designmodes.app.builder;

/**
 * 建造者抽象接口
 */
public interface Builder {
    void buildCpu(String cpu);

    void buildMemory(String memonry);

    void buildHD(String hd);

    Computer create();

}
