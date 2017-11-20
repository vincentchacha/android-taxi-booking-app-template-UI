package com.example.chacha.itaxi.Helpers;

import android.app.ProgressDialog;
import android.content.Context;
import android.view.Window;


public class CustomDialog extends ProgressDialog {

    public CustomDialog(Context context) {
        super(context);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setIndeterminate(true);
        setMessage("Please wait...");
      //  setContentView(R.layout.custom_dialog);
    }
}
