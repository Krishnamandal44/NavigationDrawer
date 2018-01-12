package com.example.krishna.navigationdrawer;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Profile extends MainActivity {

    private Button saveChangesBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_profile, null, false);
        mDrawerLayout.addView(contentView, 0);
        actionBarTitle.setText("Profile");
        frameNotification.setVisibility(View.GONE);
        saveChangesBtn=(Button) findViewById(R.id.save_changes_btn);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
                    mDrawerLayout.closeDrawers();
                }else {
                    onBackPressed();
                }
            }
        });
        actionBarDrawerToggle.setDrawerIndicatorEnabled(false);
        Drawable drawable = ResourcesCompat.getDrawable(getResources(),   R.drawable.ic_arrow_back, getApplication().getTheme());
        actionBarDrawerToggle.setHomeAsUpIndicator(drawable);
        saveChangesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Profile.this, "Change Successful", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Profile.this, DashBoard.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
}
