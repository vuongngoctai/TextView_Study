package com.vuongngoctai.textview_study;

import android.os.CountDownTimer;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity  {
    ProgressBar pgress_1;
    Button btn_incre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*referenceView use Anh xa cac view*/
        referenceView();

        /*listener use lang nghe su kien cac view*/
        listener();
    }

    private void listener() {
        pgress_1.setProgress( pgress_1.getProgress() + 10);
        btn_incre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final CountDownTimer countDownTimer = new CountDownTimer(10000,1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        pgress_1.setProgress( pgress_1.getProgress() + 10);
                    }

                    @Override
                    public void onFinish() {
                        this.start();
                    }
                };
                countDownTimer.start();
            }
        });
    }

    private void referenceView() {
        pgress_1 = (ProgressBar) findViewById(R.id.pgress_1);
        btn_incre = (Button) findViewById(R.id.btn_incre);
    }
}
