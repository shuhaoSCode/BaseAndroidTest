package com.shuhao.baseandroidtest;

import android.content.Context;
import android.support.annotation.NonNull;

import com.shuhao.libs.common.CommonDialog;
import com.shuhao.libs.utils.L;

import butterknife.OnClick;

/**
 * Created by luke on 2017/10/11.
 */

public class DemoDialog extends CommonDialog {

    public DemoDialog(@NonNull Context context) {
        super(context);
    }

    @Override
    protected void initDialog() {
        L.d("initDialog");
    }

    @Override
    protected int bindLayout() {
        return R.layout.test_dialog;
    }

    @Override
    protected void onShow() {
        L.d("onShow");
    }

    @Override
    protected void onDismiss() {
        L.d("onDismiss");
    }

    @OnClick(R.id.dialog_btn_close)
    void dialog_btn_close() {
        dismiss();
    }

}
