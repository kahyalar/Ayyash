package com.example.android.ayyash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.github.dubu.lockscreenusingservice.Lockscreen;

public class MainActivity extends AppCompatActivity {

    private Button buttonCall, buttonMessage, buttonCamera, buttonTaxi, buttonSettings, buttonExit;

    public void initViews()
    {
        buttonCall = (Button)findViewById(R.id.btnAra);
        buttonMessage = (Button)findViewById(R.id.btnMesajGonder);
        buttonCamera = (Button)findViewById(R.id.btnKamera);
        buttonTaxi = (Button)findViewById(R.id.btnTaksiCagir);
        buttonSettings = (Button)findViewById(R.id.btnAyarlar);
        buttonExit = (Button)findViewById(R.id.btnCikis);
    }

    public void initHelpers()
    {
        buttonCall.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {

            }
        });

        buttonMessage.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {

            }
        });

        buttonCamera.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {

            }
        });

        buttonTaxi.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {

            }
        });

        buttonSettings.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {

            }
        });

        buttonExit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Lockscreen.getInstance(MainActivity.this).stopLockscreenService();
                finish();
            }
        });
    }

    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        switch (keyCode){
            case KeyEvent.KEYCODE_HOME:
                Toast.makeText(MainActivity.this, "You are drunk!", Toast.LENGTH_SHORT).show();
                return true;
            case KeyEvent.KEYCODE_BACK:
                Toast.makeText(MainActivity.this, "You can't close this application via back button. If you want to close it, Press 'Exit Button'. ", Toast.LENGTH_LONG).show();
                return true;
            case KeyEvent.KEYCODE_MENU:
                Toast.makeText(MainActivity.this, "You can't close this application via back button. If you want to close it, Press 'Exit Button'. ", Toast.LENGTH_LONG).show();
                return true;
            default:
                return true;
        }
    }

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Lockscreen.getInstance(MainActivity.this).startLockscreenService();
        initViews();
        initHelpers();
    }
}
