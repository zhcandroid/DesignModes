package com.designmodes.app.adapter;

/**
 * 电压适配器adapter
 * 3大角色
 * 1目标角色，也就是所期待得到的接口。
 * 2需要适配的接口
 * 3适配器角色，是适配器模式的核心。适配器将源接口转换成目标接口
 *
 * 使用场景：“需要统一的输出接口，而输入端的类型不可预知”情形，
 */
public class VoltaAdapter extends Volta220 implements IVolta {
    @Override
    public int getFiveVolta() {

        //1获取自己的220v 电压
        int volta220 = getVolta220();
        //2 吧220V电压转化成自己需要的5V电压 最后交给客户端调用即可

        //可以看到 适配器模式在不改变其他java类的同时 实现了接口的转化把220v电压转变成需要的5v电压
        return 5;
    }
}
