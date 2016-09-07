package com.iven.timetextview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.iven.timetextview.view.TimeTextView;

public class MainActivity extends AppCompatActivity {
    private TimeTextView tv_show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        tv_show = (TimeTextView) findViewById(R.id.tv_show);
        tv_show.setAllTimeTextColor(200,200,200);//设置全部的文字的颜色
        tv_show.setPartColor(100, 200, 123);//设置倒计时时间部分的字体颜色
        tv_show.setIsStyleable(true);//设置倒计时可以显示多种颜色支持
        tv_show.setHeadInfo("你的时间不多了");//设置倒计时的提示头信息(内部自带一个英文的冒号)
        tv_show.setEndInfo("王炸！！！");//设置倒计时结束后的提示信息
        tv_show.setLeftTime(10000);//设置倒计时的时间

    }
}
