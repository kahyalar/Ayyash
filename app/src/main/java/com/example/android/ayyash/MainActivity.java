package com.example.android.ayyash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

    }

    public void onBackPressed()
    {
        Toast.makeText(this, "You can't close this application via back button. If you want to close it, Press 'Exit Button'. ", Toast.LENGTH_LONG).show();
    }

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Lockscreen.getInstance(this).startLockscreenService();
        initViews();
    }
}
