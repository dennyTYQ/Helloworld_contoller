package com.tyqtest.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.lang.reflect.Array;

/**
 * Created by 谭雅清 on 2017/10/13.
 */

public class SpinnerActivity extends Activity {
    private Spinner spinner=null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        spinner=(Spinner) findViewById(R.id.spinner);
        String [] mItems = getResources().getStringArray(R.array.spinnername);
        //第一参数市上下文，第二个参数是显示的样式 ，第三个参数是数据源
        ArrayAdapter<String> _Adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,mItems);
         spinner.setAdapter(_Adapter);
    }
}
