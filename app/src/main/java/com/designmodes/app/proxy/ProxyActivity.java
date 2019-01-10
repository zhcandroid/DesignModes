package com.designmodes.app.proxy;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.LinearLayout;

/**
 * 代理
 */
public class ProxyActivity extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new LinearLayout(this));
        //1 测试动态代理
        testProxy();
        //2 测试静态代理
        testStaticProxy();
    }

    //1 测试动态代理 ，Java提供了动态的代理接口InvocationHandler
    public void testProxy(){
        /**
         * 代理的定义：为其他对象提供一种代理以控制这个对象的访问。
         * 静态代理与动态代理：从代码的角度来分，代理可以分为两种：一种是静态代理，另一种是动态代理。
                            静态代理就是在程序运行前就已经存在代理类的字节码文件，代理类和委托类的关系在运行前就确定了。
         上面的例子实现就是静态代理。
                            动态代理类的源码是在程序运行期间根据反射等机制动态的生成，所以不存在代理类的字节码文件。
         代理类和委托类的关系是在程序运行时确定。
         */

        DynamicProxy mDynamicProxy = new DynamicProxy();
        Buyer1 buyer1 = new Buyer1();
        Buyer2 buyer2 = new Buyer2();

        //根据传入的对象 动态生成
        //这里可以结合工厂设计模式 把生成Subject的具体方式隐藏起来 
        Subject buyer1_proxy = (Subject) mDynamicProxy.newInstanceProxyObj(buyer1);
        buyer1_proxy.buy();

        Subject buyer2_proxy = (Subject) mDynamicProxy.newInstanceProxyObj(buyer2);
        buyer2_proxy.buy();

    }


    // 测试静态代理
    public void testStaticProxy(){
        Buyer1 buyer1 = new Buyer1();
        Buyer2 buyer2 = new Buyer2();

        SubjectImpl subject = new SubjectImpl(buyer1);
        subject.buy();

        SubjectImpl subject2 = new SubjectImpl(buyer2);
        subject2.buy();

    }



}
