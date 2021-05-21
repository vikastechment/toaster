package com.techment.vikas.toasterlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {

    public static void showCustomToast(Context c, String message){

        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();

    }
}
