package com.designmodes.app.strategy;

/**
 * 真正的策略管理者
 * //持有抽象策略角色的引用
 * <p>
 * 个人感觉策略模式有点模糊 似乎没有存在的必要，只不过是编码过程中的一种思考
 * 为了解决米哦一类问题的而产生的一种控制器 其实编码过程中我们无形的已经使用了很多设计模式
 * 尤其是面向接口编程的过程中
 */
public class StrategyManager {


    private Istrategy mStrategy;

    public Istrategy strategyMan(String action) {

        switch (action) {
            case "A":
                mStrategy = new StrategyA();

                break;
            case "B":
                mStrategy = new StrategyB();

                break;
            case "C":
                mStrategy = new StrategyC();

                break;
        }

        return mStrategy;
    }


    public void show() {
        mStrategy.show();
    }

}
