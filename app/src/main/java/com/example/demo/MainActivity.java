package com.example.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTv1;
    private Button mBtn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        initListener();
    }

    private void initData() {

    }

    private void initView() {
        mTv1 = (TextView) findViewById(R.id.tv1);
        mBtn1 = (Button) findViewById(R.id.btn1);


    }

    private void initListener() {
        mBtn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                mTv1.setText("点击");
                Toast.makeText(getApplicationContext(),"点击事件",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
