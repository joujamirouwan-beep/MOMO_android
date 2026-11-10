package com.momo.scanner;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.graphics.Color;
import android.view.Gravity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(1);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(30, 30, 30, 30);
        layout.setBackgroundColor(Color.WHITE);

        TextView title = new TextView(this);
        title.setText("MOMO");
        title.setTextSize(38);
        title.setTextColor(Color.rgb(20, 120, 70));
        title.setGravity(Gravity.CENTER);

        TextView subtitle = new TextView(this);
        subtitle.setText("SMART ANIMAL SCANNER");
        subtitle.setTextSize(17);
        subtitle.setGravity(Gravity.CENTER);

        Button scan = new Button(this);
        scan.setText("ابدأ فحص الحيوان");

        TextView status = new TextView(this);
        status.setText("مرحباً بك في تطبيق MOMO");
        status.setTextSize(18);
        status.setGravity(Gravity.CENTER);

        scan.setOnClickListener(v ->
            status.setText("واجهة الفحص جاهزة. يلزم ربط المسبار الذكي.")
        );

        layout.addView(title);
        layout.addView(subtitle);
        layout.addView(scan);
        layout.addView(status);

        setContentView(layout);
    }
}
