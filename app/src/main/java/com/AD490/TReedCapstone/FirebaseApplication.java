package com.AD490.TReedCapstone;

import com.google.firebase.FirebaseApp;

public class FirebaseApplication extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }
}
