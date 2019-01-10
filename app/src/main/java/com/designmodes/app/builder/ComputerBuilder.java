package com.designmodes.app.builder;

/**
 * 创建具体的建造者（ConcreteBuilder）:装机人员
 */
public class ComputerBuilder implements Builder {
    Computer mComputer = new Computer();

    @Override
    public void buildCpu(String cpu) {
        mComputer.setmCPU(cpu);
    }

    @Override
    public void buildMemory(String memonry) {
        mComputer.setmMemory(memonry);
    }

    @Override
    public void buildHD(String hd) {
        mComputer.setmHD(hd);
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
