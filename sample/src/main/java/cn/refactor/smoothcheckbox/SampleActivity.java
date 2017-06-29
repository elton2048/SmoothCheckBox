package cn.refactor.smoothcheckbox;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import cn.refactor.library.SmoothCheckBox;

public class SampleActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        final SmoothCheckBox scb = (SmoothCheckBox) findViewById(R.id.scb);
        scb.setOnCheckedChangeListener(new SmoothCheckBox.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(SmoothCheckBox checkBox, boolean isChecked) {
                Log.d("SmoothCheckBox", String.valueOf(isChecked));
            }
        });

        final SmoothCheckBox scbProgram = (SmoothCheckBox) findViewById(R.id.scb_program);
        scbProgram.setChecked(true, true);
//        scbProgram.setColorTick(Color.WHITE);
//        scbProgram.setColorUnchecked(Color.GRAY);
//        scbProgram.setColorChecked(Color.BLACK);
//        scbProgram.setColorFloorUnchecked(Color.BLACK);
    }

}
