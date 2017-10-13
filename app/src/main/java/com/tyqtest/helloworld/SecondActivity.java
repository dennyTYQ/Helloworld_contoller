package com.tyqtest.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by 谭雅清 on 2017/10/12.
 */

public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        LinearLayout linearLayout =(LinearLayout)findViewById(R.id.linear1);
        linearLayout.setBackgroundResource(R.drawable.pikai);
        final Intent intent = getIntent();
        String Date = intent.getStringExtra("extra_data");
        Log.d("SecondActivity",Date);
        Button button_dia = (Button)findViewById(R.id.dialog);
        Button button =(Button)findViewById(R.id.edit);
        button_dia.setText(Date);
        button_dia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:10086"));
                startActivity(intent);

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(SecondActivity.this ,ThirdActivity.class);
                startActivity(intent1);
            }
        });
    }
}
