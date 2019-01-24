package com.example.tugasapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void LinearLayout(View view) {
        startActivity(new Intent(HomeActivity.this, LinearLayout1.class));
    }

    public void LinearRelative(View view) {
        startActivity(new Intent(HomeActivity.this, LinearLayoutActivity.class));
    }

    public void RelativeLayoutOri(View view) {
        startActivity(new Intent(HomeActivity.this, RelativeLayoutActivity.class));
    }

    public void RelativeLinear(View view) {
        startActivity(new Intent(HomeActivity.this, RelativeLayout1.class));
    }
}
