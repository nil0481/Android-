package com.example.calendar;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    CalendarView calendarView;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calendarView=(CalendarView) findViewById(R.id.calendarView);
        textView=(TextView) findViewById(R.id.textView);
        button=(Button) findViewById(R.id.button);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int dayOfMonth) {
                String date=year+ "/" + (month+1) +"/"+ dayOfMonth;
                textView.setText(date);
            }
        });
        /*

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calendarView.setDate(Calendar.getInstance().getTimeInMillis());
            }
        });*/

    }

    public void buclick(View view) {
        Calendar calendar=Calendar.getInstance();
        final int yr=calendar.get(Calendar.YEAR);
        final int mn=calendar.get(Calendar.MONTH);
        final int d=calendar.get(Calendar.DAY_OF_MONTH);
        String date1=yr+ "/" + (mn+1) +"/"+ d;
        textView.setText(date1);
        calendarView.setDate(Calendar.getInstance().getTimeInMillis());


        }

    }

