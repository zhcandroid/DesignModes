package com.designmodes.app.proxy;

/**
 * 静态代理
 */
public class SubjectImpl implements Subject{

    private Subject mSubject;

    public SubjectImpl(Subject subject) {
        this.mSubject = subject;
    }

    @Override
    public void buy() {
        System.out.println("我是静态代理：======");
        mSubject.buy();

    }
}
