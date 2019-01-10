package com.designmodes.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.designmodes.app.proxy.Buyer1;
import com.designmodes.app.proxy.Buyer2;
import com.designmodes.app.proxy.DynamicProxy;
import com.designmodes.app.proxy.ProxyActivity;
import com.designmodes.app.proxy.Subject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("我是mainActivity");


    }


    public void proxyMode(View view){

        startActivity(new Intent(this, ProxyActivity.class));

    }


}
