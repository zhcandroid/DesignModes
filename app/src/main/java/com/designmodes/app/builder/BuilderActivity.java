package com.designmodes.app.builder;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.LinearLayout;

/**
 * 建造者模式
 */
public class BuilderActivity extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new LinearLayout(this));
        ComputerBuilder builder = new ComputerBuilder();
        Director mDirector = new Director(builder);
        Builder construct = mDirector.construct("英特尔Cpu", "16G大内存", "希捷硬盘很好");




    }


}
