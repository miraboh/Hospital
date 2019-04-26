package com.example.hospital;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Final_View_Report extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.final_view_report);

        Bundle bb = getIntent().getExtras();
        String report = bb.getString("report");
        TextView final_report = (TextView) findViewById(R.id.tv_report);
        final_report.setText(report);

    }

}
