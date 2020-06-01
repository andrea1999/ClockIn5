package com.example.clockin5.ui.inicio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.applandeo.materialcalendarview.CalendarView;
import com.applandeo.materialcalendarview.EventDay;
import com.applandeo.materialcalendarview.listeners.OnDayClickListener;
import com.example.clockin5.IncioActivity;
import com.example.clockin5.R;
import com.example.clockin5.RegistrosActivity;

import org.jetbrains.annotations.NotNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class IncioFragment extends Fragment {
    private static final String TEXT = "text";
    Button b;
    CalendarView cv;

    public static IncioFragment newInstance() {
        IncioFragment frag = new IncioFragment();
        return frag;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
            Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_inicio, container, false);

        if (getArguments() != null) {
            ((TextView) layout.findViewById(R.id.text)).setText(getArguments().getString(TEXT));
        }

        cv = layout.findViewById(R.id.calendarView);
        cv.setOnDayClickListener(new OnDayClickListener() {
            @Override
            public void onDayClick(@NotNull EventDay eventDay) {
                Calendar selectedDate = eventDay.getCalendar();
                Date date = selectedDate.getTime();
                SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
                String inActiveDate = null;
                try {
                    inActiveDate = format1.format(date);
                    Toast.makeText(getActivity(), ""+ inActiveDate , Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getActivity(), RegistrosActivity.class);
                    i.putExtra("fecha", inActiveDate);
                    startActivity(i);
                } catch (Exception e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        });

        return layout;
    }
}
