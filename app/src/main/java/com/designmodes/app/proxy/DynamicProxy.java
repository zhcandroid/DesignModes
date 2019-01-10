package com.designmodes.app.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 *
 * // 1. 动态生成 代理对象
 // 2.  指定 代理对象运行目标对象方法时需要完成的 具体任务
 // 注：需实现InvocationHandler接口 = 调用处理器 接口
 // 所以称为 调用处理器类
 */
public class DynamicProxy implements InvocationHandler{

    private Object mProxyObj;

    public Object newInstanceProxyObj(Object proxyObj) {
        this.mProxyObj = proxyObj;
        return Proxy.newProxyInstance(proxyObj.getClass().getClassLoader(),proxyObj.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = null;
        // 通过Java反射机制调用目标对象方法
        result = method.invoke(mProxyObj, args);

        return result;
    }
}
