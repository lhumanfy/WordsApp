package com.pers.remwords.base;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.pers.remwords.base.ActivityCollect;

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("BaseActivity",getClass().getSimpleName());
        ActivityCollect.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        ActivityCollect.removeActivity(this);
        Log.d("TAG", "onDestroy: "+this);
        super.onDestroy();
    }


}
