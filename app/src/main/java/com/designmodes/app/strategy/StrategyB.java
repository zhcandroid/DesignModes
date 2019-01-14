package com.designmodes.app.strategy;

/**
 * A策略 实现了Istrategy
 */
public class StrategyB implements Istrategy{
    @Override
    public void show() {
        System.out.println("我是策略B：我展示的是夏天的活动");
    }
}
