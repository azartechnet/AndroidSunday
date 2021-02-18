package com.example.timepickerprocess;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

/**
 * Created by Admin on 02-03-2016.
 */
public class DialogHandler extends DialogFragment
{
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        Calendar calendar=Calendar.getInstance();
        int hour=calendar.get(Calendar.HOUR_OF_DAY);
        int min=calendar.get(Calendar.MINUTE);
        TimePickerDialog dialog;
        TimeSettings timeSettings=new TimeSettings(getActivity());
        dialog =new TimePickerDialog(getActivity(),timeSettings,hour,min, DateFormat.is24HourFormat(getActivity()));

        return  dialog;
        //return super.onCreateDialog(savedInstanceState);
    }
}
