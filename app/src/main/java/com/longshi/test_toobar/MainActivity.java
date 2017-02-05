package com.longshi.test_toobar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToobar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToobar = (Toolbar) findViewById(R.id.toobar);

        //设置导航图标
        mToobar.setNavigationIcon(R.mipmap.ic_launcher);
        //设置导航图标的监听
        mToobar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        //设置menu选项
        mToobar.inflateMenu(R.menu.menu);

        //menu设置监听
        mToobar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.delete:
                        Toast.makeText(MainActivity.this,"删除",Toast.LENGTH_LONG).show();
                        break;
                   case R.id.update:
                       Toast.makeText(MainActivity.this,"搜索",Toast.LENGTH_LONG).show();
                        break;
                }
                //这里返回true表示自己处理
                return true;
            }
        });

    }
}
