package com.hfad.wellbeingtechheartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
   // private ActivityMainBinding binding;
    private SensorManager mSensorManager;
    private Sensor mHeartRateSensor;
    private TextView mHeartTextView;
    private Button mStartButton;
    private Button mStopButton;
    private static final int BODY_SENSOR = 21;
    private DAODBHeartRate daodbHeartRate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}