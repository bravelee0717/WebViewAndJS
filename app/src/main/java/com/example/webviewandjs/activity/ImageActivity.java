package com.example.webviewandjs.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.webviewandjs.R;
import com.example.webviewandjs.models.KingZero;

public class ImageActivity extends AppCompatActivity {
    private KingZero kingZero;
    private TextView title;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        title = findViewById(R.id.title);
        imageView = findViewById(R.id.image);
        afterView();
    }

    private void afterView() {
        kingZero = (KingZero) getIntent().getExtras().get("zero");
        title.setText(kingZero.getName());
        imageView.setBackgroundResource(kingZero.getResId());
    }

}
