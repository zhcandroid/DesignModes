package com.designmodes.app.strategy;

/**
 * A策略 实现了Istrategy
 */
public class StrategyA implements Istrategy{
    @Override
    public void show() {
        System.out.println("我是策略A：我展示的是春天的活动");
    }
}
