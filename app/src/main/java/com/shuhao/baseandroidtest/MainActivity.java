package com.shuhao.baseandroidtest;


import android.widget.TextView;

import com.shuhao.libs.common.CommonActivity;

import butterknife.BindView;

public class MainActivity extends CommonActivity {

    @BindView(R.id.main_text)
    TextView main_text;

    @Override
    protected void onCreate() {
        main_text.setText("test");
    }

    @Override
    protected int bindLayout() {
        return R.layout.activity_main;
    }
}
