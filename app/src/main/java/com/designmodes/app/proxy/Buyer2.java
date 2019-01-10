package com.designmodes.app.proxy;

/**
 * 李四想要购买macbook pro电脑
 */
public class Buyer2 implements Subject {
    @Override
    public void buy() {
        System.out.println("李四想要购买macbookpro电脑");

    }
}
