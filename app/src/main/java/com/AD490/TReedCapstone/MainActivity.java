package com.AD490.TReedCapstone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.google.firebase.FirebaseApp;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FirebaseApp.initializeApp(this);
        setContentView(R.layout.activity_main);
    }
}
