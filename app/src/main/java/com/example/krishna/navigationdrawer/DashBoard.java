package com.example.krishna.navigationdrawer;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class DashBoard extends MainActivity {
    private LinearLayout attendanceBtn;
    private LinearLayout quotationBtn;
    private LinearLayout taBtn;
    private LinearLayout customerRegistration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_dash_board, null, false);
        mDrawerLayout.addView(contentView, 0);
        initialiseView();
        onclickBtn();
    }

    private void onclickBtn() {


        attendanceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DashBoard.this, "Work In Progress", Toast.LENGTH_SHORT).show();
            }
        });
        quotationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DashBoard.this, "Work In Progress", Toast.LENGTH_SHORT).show();
            }
        });
        taBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DashBoard.this, "Work In Progress", Toast.LENGTH_SHORT).show();
            }
        });
        customerRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DashBoard.this, "Work In Progress", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initialiseView() {
        attendanceBtn = (LinearLayout) findViewById(R.id.attendance_btn);
        quotationBtn = (LinearLayout) findViewById(R.id.quotation_btn);
        taBtn = (LinearLayout) findViewById(R.id.dashboard_ta_btn);
        customerRegistration = (LinearLayout) findViewById(R.id.dashboard_customer_registration);
    }
}
