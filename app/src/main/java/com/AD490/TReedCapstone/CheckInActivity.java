package com.AD490.TReedCapstone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageButton;


public class CheckInActivity extends AppCompatActivity {

    public TextView checkintitle;
    public ImageButton addabtn;
    public ImageButton coindexterbtn;
    public ImageButton jupiterbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_in);
        checkintitle = findViewById(R.id.checkinTitle);
        addabtn = findViewById(R.id.addabtn);
        coindexterbtn = findViewById(R.id.coindexterbtn);
        jupiterbtn = findViewById(R.id.jupiterbtn);
    }
}
