package com.longshi.test_drawerlayout;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.graphics.drawable.DrawerArrowDrawable;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toobar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer);

        //关联toobar和drawerlayout,第四个第五个参数必须是R.string.xxx
        ActionBarDrawerToggle toggle =
                new ActionBarDrawerToggle(this, drawer, toolbar, R.string.app_name, R.string.app_name);
        //获取图标
        DrawerArrowDrawable drawerArrowDrawable = toggle.getDrawerArrowDrawable();
        //设置图标颜色
        drawerArrowDrawable.setColor(Color.YELLOW);
        //同步
        toggle.syncState();
        //添加监听
        drawer.addDrawerListener(toggle);
    }
}
