package com.example.webviewandjs.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.webviewandjs.R;

public class SwitchActivity extends Activity {
    private Button bt_load;
    private Button bt_honor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);
        bt_load = (Button) findViewById(R.id.bt_load);
        bt_honor = (Button) findViewById(R.id.bt_honor);
        bt_load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SwitchActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        bt_honor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SwitchActivity.this, RecycleViewActivity.class);
                startActivity(intent);
            }
        });
    }
}
