package com.example.admin.toggle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.admin.toggle.ui.ToggleView;

public class MainActivity extends AppCompatActivity {

    private ToggleView mToggleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToggleView = (ToggleView) findViewById(R.id.toggleView);
//        mToggleView.setSwitchBackgroundResource(R.drawable.switch_background);
//        mToggleView.setSlideButtonResource(R.drawable.slide_button);
//        mToggleView.setSwitchState(true);
        // 设置开关更新监听
        mToggleView.setOnSwitchStateUpdateListener(new ToggleView.OnSwitchStateUpdateListener(){

            @Override
            public void onStateUpdate(boolean state) {
                Toast.makeText(getApplicationContext(), "state: " + state, Toast.LENGTH_SHORT).show();
            }

        });
    }
}
