package com.tyqtest.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

/**
 * Created by 谭雅清 on 2017/10/12.
 */

public class ThirdActivity extends Activity {
    private ImageView imageView = null;
    private ToggleButton toggleButton=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);
        imageView=(ImageView)findViewById(R.id.ima);
        toggleButton = (ToggleButton) findViewById(R.id.toggle);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                toggleButton.setChecked(b);
                imageView.setImageResource(b?R.drawable.pikai:R.drawable.lamp);
            }
        });

        Button button = (Button)findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThirdActivity.this,SpinnerActivity.class);
                startActivity(intent);
            }
        });
    }

}
