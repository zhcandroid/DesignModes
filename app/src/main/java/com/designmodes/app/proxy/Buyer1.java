package com.designmodes.app.proxy;

/**
 * 张三想要购买iphone手机
 */
public class Buyer1 implements Subject {
    @Override
    public void buy() {
        System.out.println("张三想要购买iphone手机");

    }
}
