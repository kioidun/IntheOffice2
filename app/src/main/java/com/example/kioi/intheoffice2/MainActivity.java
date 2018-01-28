package com.example.kioi.intheoffice2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.kioi.intheoffice2.PagerActivity;
import com.example.kioi.intheoffice2.R;
import com.example.kioi.intheoffice2.Utilities.Utils;
import com.example.kioi.intheoffice2.Utilities.Utils;


public class MainActivity extends AppCompatActivity {

    public static final String PREF_USER_FIRST_TIME ="user_first_time";
    boolean isUsersFirstTime;
    @Override
    public void onStart(){
        super.onStart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        isUsersFirstTime=Boolean.valueOf(Utils.readSharedSetting(MainActivity.this,PREF_USER_FIRST_TIME,"true"));

        Intent introIntent = new Intent(MainActivity.this,PagerActivity.class);
        introIntent.putExtra(PREF_USER_FIRST_TIME,isUsersFirstTime);

        if(isUsersFirstTime)

            startActivity(introIntent);
        setContentView(R.layout.activity_main);
    }
}
