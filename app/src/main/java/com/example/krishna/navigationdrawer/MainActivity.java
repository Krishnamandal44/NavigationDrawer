package com.example.krishna.navigationdrawer;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    protected ActionBarDrawerToggle actionBarDrawerToggle;
    protected NavigationView navigationView;
    private FrameLayout header;
    private View headerLayout;
    protected DrawerLayout mDrawerLayout;
    protected Toolbar toolbar;
    protected TextView actionBarTitle;
    protected FrameLayout frameNotification;

    private LinearLayout btnTermsConditions;
    private LinearLayout profileBtn;
    private LinearLayout dashBoardBtn;
    private LinearLayout quotationBtn;
    private LinearLayout sendQuotationBtn;
    private LinearLayout listQuotationBtn;
    private LinearLayout attendanceBtn;
    private LinearLayout markAttendanceBtn;
    private LinearLayout detailsAttendanceBtn;
    private LinearLayout taInputBtn;
    private LinearLayout taDetailsBtn;
    private LinearLayout tABtn;
    private LinearLayout customerRegistrationBtn;
    private LinearLayout customerNewRegistrationBtn;
    private LinearLayout customerListBtn;
    private LinearLayout vendorRegistrationBtn;
    private LinearLayout vendorNewRegistrationBtn;
    private LinearLayout vendorListBtn;

    private ImageView attandaceExpand;
    private ImageView quotationExpand;
    private ImageView taExpand;
    private ImageView customerExpand;
    private ImageView vendorExpand;

    private TextView markAttendanceLineVisible;
    private TextView attendanceDetailsLineVisible;
    private TextView sendQuotationLineVisible;
    private TextView listQuotationLineVisible;
    private TextView taDetailsLineVisible;
    private TextView taInputLineVisible;
    private TextView customerNewRegistrationLineVisible;
    private TextView customerListLineVisible;
    private TextView vendorNewRegistrationLineVisible;
    private TextView vendorLisLineVisible;

    private int attendanceCount = 0;
    private int quotationCount = 0;
    private int taCount = 0;
    private int customerCount = 0;
    private int vendorCount = 0;
    private LinearLayout redeemCustomerCoupon;
    private LinearLayout couponRedeemBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        navigationView = (NavigationView) findViewById(R.id.navigation);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        navigationView.addHeaderView(inflater.inflate(R.layout.header_layout, null));
        setSupportActionBar(toolbar);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        headerLayout = navigationView.getHeaderView(0);
        header = (FrameLayout)headerLayout. findViewById(R.id.header);

        initialiseActionBarViews();
        setDrawerItemOnClicks();
    }

    private void initialiseActionBarViews() {
//        navButton = (ImageView) findViewById(R.id.navicon);
        actionBarTitle = (TextView) findViewById(R.id.action_bar_Title);
        frameNotification = (FrameLayout) findViewById(R.id.frame_notification);
    }

    private void setDrawerItemOnClicks() {
        profileBtn = (LinearLayout) headerLayout.findViewById(R.id.base_activity_profile);
        attendanceBtn = (LinearLayout) headerLayout.findViewById(R.id.base_activity_attendance);
        markAttendanceBtn = (LinearLayout) headerLayout.findViewById(R.id.base_activity_mark_attendance);
        detailsAttendanceBtn = (LinearLayout) headerLayout.findViewById(R.id.base_activity_attendance_details);
        quotationBtn = (LinearLayout) headerLayout.findViewById(R.id.base_activity_quotation);
        sendQuotationBtn = (LinearLayout) headerLayout.findViewById(R.id.base_activity_send_quotation);
        listQuotationBtn = (LinearLayout) headerLayout.findViewById(R.id.base_activity_quotation_list);
        dashBoardBtn = (LinearLayout) headerLayout.findViewById(R.id.base_activity_dashboard);
        customerRegistrationBtn = (LinearLayout) headerLayout.findViewById(R.id.base_activity_customer_registration);
        customerNewRegistrationBtn = (LinearLayout) headerLayout.findViewById(R.id.base_activity_customer_new_registration);
        customerListBtn = (LinearLayout) headerLayout.findViewById(R.id.base_activity_customer_list);
        vendorRegistrationBtn = (LinearLayout) headerLayout.findViewById(R.id.base_vendor_registration);
        vendorNewRegistrationBtn = (LinearLayout) headerLayout.findViewById(R.id.base_activity_vendor_new_registration);
        vendorListBtn = (LinearLayout) headerLayout.findViewById(R.id.base_activity_vendor_list);
        tABtn = (LinearLayout) headerLayout.findViewById(R.id.base_activity_ta_btn);
        taInputBtn = (LinearLayout) headerLayout.findViewById(R.id.base_activity_ta_input);
        taDetailsBtn = (LinearLayout) headerLayout.findViewById(R.id.base_activity_ta_details);
        couponRedeemBtn = (LinearLayout) headerLayout.findViewById(R.id.base_coupon_redeem);
        redeemCustomerCoupon = (LinearLayout) headerLayout.findViewById(R.id.base_redeem_customer_coupon);
        attandaceExpand = (ImageView) headerLayout.findViewById(R.id.base_attandance_expand);
        quotationExpand = (ImageView) headerLayout.findViewById(R.id.base_quotation_expand);
        taExpand = (ImageView) headerLayout.findViewById(R.id.base_ta_expand);
        customerExpand = (ImageView) headerLayout.findViewById(R.id.base_customer_expand);
        vendorExpand = (ImageView) headerLayout.findViewById(R.id.base_vendor_expand);
        markAttendanceLineVisible = (TextView) headerLayout.findViewById(R.id.base_mark_attendance_line_visible);
        attendanceDetailsLineVisible = (TextView) headerLayout.findViewById(R.id.base_attendance_details_line_visible);
        sendQuotationLineVisible = (TextView) headerLayout.findViewById(R.id.base_send_quotation_line_visible);
        listQuotationLineVisible = (TextView) headerLayout.findViewById(R.id.base_quotation_list_line_visible);
        taDetailsLineVisible = (TextView) headerLayout.findViewById(R.id.base_ta_details_line_visible);
        taInputLineVisible = (TextView) headerLayout.findViewById(R.id.base_ta_input_line_visible);
        customerNewRegistrationLineVisible = (TextView) headerLayout.findViewById(R.id.base_customer_new_reg_line_visible);
        customerListLineVisible = (TextView) headerLayout.findViewById(R.id.base_customer_list_line_visible);
        vendorNewRegistrationLineVisible = (TextView) headerLayout.findViewById(R.id.base_vendor_new_reg_line_visible);
        vendorLisLineVisible = (TextView) headerLayout.findViewById(R.id.base_vendor_list_line_visible);
//        btnContuctUs = (LinearLayout) findViewById(R.id.contact_us_button);
        onClickDrawerBtn();


    }

    private void onClickDrawerBtn() {
        profileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawerLayout.closeDrawer(Gravity.START);
                Intent intent = new Intent(MainActivity.this, Profile.class);
//                intent.putExtra("key", "LogIn");
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }
        });
        attendanceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickAtandaceBtn();

            }
        });
        tABtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickTABtn();

            }
        });
        quotationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickQuotationBtn();

            }
        });
        customerRegistrationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickCustomerBtn();

            }
        });
        vendorRegistrationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickVendorBtn();

            }
        });

        markAttendanceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawerLayout.closeDrawer(Gravity.START);
                Toast.makeText(MainActivity.this, "Work In Progress", Toast.LENGTH_SHORT).show();

            }
        });
        detailsAttendanceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawerLayout.closeDrawer(Gravity.START);
                Toast.makeText(MainActivity.this, "Work In Progress", Toast.LENGTH_SHORT).show();

            }
        });
        dashBoardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawerLayout.closeDrawer(Gravity.START);
                Intent intent = new Intent(MainActivity.this, DashBoard.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }
        });
        sendQuotationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawerLayout.closeDrawer(Gravity.START);
                Toast.makeText(MainActivity.this, "Work In Progress", Toast.LENGTH_SHORT).show();

            }
        });
        listQuotationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawerLayout.closeDrawer(Gravity.START);
                Toast.makeText(MainActivity.this, "Work In Progress", Toast.LENGTH_SHORT).show();

            }
        });

        taInputBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawerLayout.closeDrawer(Gravity.START);
                Toast.makeText(MainActivity.this, "Work In Progress", Toast.LENGTH_SHORT).show();

            }
        });
        taDetailsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawerLayout.closeDrawer(Gravity.START);
                Toast.makeText(MainActivity.this, "Work In Progress", Toast.LENGTH_SHORT).show();

            }
        });
        customerNewRegistrationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawerLayout.closeDrawer(Gravity.START);
                Toast.makeText(MainActivity.this, "Work In Progress", Toast.LENGTH_SHORT).show();

            }
        });
        customerListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawerLayout.closeDrawer(Gravity.START);
                Toast.makeText(MainActivity.this, "Work In Progress", Toast.LENGTH_SHORT).show();

            }
        });
        vendorNewRegistrationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawerLayout.closeDrawer(Gravity.START);
                Toast.makeText(MainActivity.this, "Work In Progress", Toast.LENGTH_SHORT).show();

            }
        });
        vendorListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawerLayout.closeDrawer(Gravity.START);
                Toast.makeText(MainActivity.this, "Work In Progress", Toast.LENGTH_SHORT).show();

            }
        });
        couponRedeemBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawerLayout.closeDrawer(Gravity.START);
                Toast.makeText(MainActivity.this, "Work In Progress", Toast.LENGTH_SHORT).show();
            }
        });
        redeemCustomerCoupon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawerLayout.closeDrawer(Gravity.START);
                Toast.makeText(MainActivity.this, "Work In Progress", Toast.LENGTH_SHORT).show();

            }
        });

    }


    private void onClickCustomerBtn() {
        if (customerCount == 0) {
            customerListBtn.setVisibility(View.VISIBLE);
            customerNewRegistrationBtn.setVisibility(View.VISIBLE);
            customerNewRegistrationLineVisible.setVisibility(View.VISIBLE);
            customerListLineVisible.setVisibility(View.VISIBLE);
            customerCount = 1;
            customerExpand.setImageResource(R.drawable.ic_expand_less);

        } else if (customerCount == 1) {
            customerListLineVisible.setVisibility(View.GONE);
            customerNewRegistrationLineVisible.setVisibility(View.GONE);
            customerNewRegistrationBtn.setVisibility(View.GONE);
            customerListBtn.setVisibility(View.GONE);
            customerCount = 0;
            customerExpand.setImageResource(R.drawable.ic_expand_more);
        }

    }

    private void onClickVendorBtn() {
        if (vendorCount == 0) {
            vendorNewRegistrationBtn.setVisibility(View.VISIBLE);
            vendorListBtn.setVisibility(View.VISIBLE);
            vendorLisLineVisible.setVisibility(View.VISIBLE);
            vendorNewRegistrationLineVisible.setVisibility(View.VISIBLE);
            vendorCount = 1;
            vendorExpand.setImageResource(R.drawable.ic_expand_less);

        } else if (vendorCount == 1) {
            vendorNewRegistrationBtn.setVisibility(View.GONE);
            vendorListBtn.setVisibility(View.GONE);
            vendorLisLineVisible.setVisibility(View.GONE);
            vendorNewRegistrationLineVisible.setVisibility(View.GONE);
            vendorCount = 0;
            vendorExpand.setImageResource(R.drawable.ic_expand_more);
        }

    }

    private void onClickTABtn() {
        if (taCount == 0) {
            taInputBtn.setVisibility(View.VISIBLE);
            taInputLineVisible.setVisibility(View.VISIBLE);
            taDetailsLineVisible.setVisibility(View.VISIBLE);
            taDetailsBtn.setVisibility(View.VISIBLE);
            taCount = 1;
            taExpand.setImageResource(R.drawable.ic_expand_less);

        } else if (taCount == 1) {
            taInputBtn.setVisibility(View.GONE);
            taInputLineVisible.setVisibility(View.GONE);
            taDetailsLineVisible.setVisibility(View.GONE);
            taDetailsBtn.setVisibility(View.GONE);
            taCount = 0;
            taExpand.setImageResource(R.drawable.ic_expand_more);
        }

    }

    private void onClickQuotationBtn() {

        if (quotationCount == 0) {
            sendQuotationBtn.setVisibility(View.VISIBLE);
            sendQuotationLineVisible.setVisibility(View.VISIBLE);
            listQuotationBtn.setVisibility(View.VISIBLE);
            listQuotationLineVisible.setVisibility(View.VISIBLE);
            quotationCount = 1;
            quotationExpand.setImageResource(R.drawable.ic_expand_less);

        } else if (quotationCount == 1) {
            sendQuotationBtn.setVisibility(View.GONE);
            detailsAttendanceBtn.setVisibility(View.GONE);
            listQuotationBtn.setVisibility(View.GONE);
            listQuotationLineVisible.setVisibility(View.GONE);
            quotationCount = 0;
            quotationExpand.setImageResource(R.drawable.ic_expand_more);
        }

    }

    private void onClickAtandaceBtn() {

        if (attendanceCount == 0) {
            markAttendanceBtn.setVisibility(View.VISIBLE);
            detailsAttendanceBtn.setVisibility(View.VISIBLE);
            markAttendanceLineVisible.setVisibility(View.VISIBLE);
            attendanceDetailsLineVisible.setVisibility(View.VISIBLE);
            attendanceCount = 1;
            attandaceExpand.setImageResource(R.drawable.ic_expand_less);

        } else if (attendanceCount == 1) {
            markAttendanceBtn.setVisibility(View.GONE);
            detailsAttendanceBtn.setVisibility(View.GONE);
            markAttendanceLineVisible.setVisibility(View.GONE);
            attendanceDetailsLineVisible.setVisibility(View.GONE);
            attendanceCount = 0;
            attandaceExpand.setImageResource(R.drawable.ic_expand_more);
        }

    }

    public void logout(View view) {
        mDrawerLayout.closeDrawer(Gravity.START);
        Toast.makeText(MainActivity.this, "Work In Progress", Toast.LENGTH_SHORT).show();
    }
}
