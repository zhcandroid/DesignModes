package com.designmodes.app.strategy;

/**
 * A策略 实现了Istrategy
 */
public class StrategyC implements Istrategy{
    @Override
    public void show() {
        System.out.println("我是策略C：我展示的是秋天的活动");
    }
}
