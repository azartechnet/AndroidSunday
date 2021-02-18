package com.example.timepickerprocess;

import android.app.TimePickerDialog;
import android.content.Context;
import android.widget.TimePicker;
import android.widget.Toast;

/**
 * Created by Admin on 02-03-2016.
 */
public class TimeSettings implements TimePickerDialog.OnTimeSetListener
{
    Context context;
    public TimeSettings(Context context)
    {
        this.context=context;
    }
    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

        Toast.makeText(context,"setting time to hour:"+hourOfDay+"minutes"+minute,Toast.LENGTH_LONG).show();
    }
}
