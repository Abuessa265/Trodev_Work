package com.example.seven;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;

public class RetailerStartUpScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_retailer_start_up_screen);

    }
    public void callLoginScreen(View view){

        Intent intent=new Intent(getApplicationContext(),Login.class);

        Pair[] pairs = new Pair[1];
        pairs[0]=new Pair<View,String>(findViewById(R.id.login_btn),"transition_login");

        if (android.os.Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            ActivityOptions options=ActivityOptions.makeSceneTransitionAnimation(RetailerStartUpScreen.this,pairs);
            startActivity(intent,options.toBundle());
        }
        else {
            startActivity(intent);
        }

    }
}