package com.brentvatne.myrnvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.util.Log;

import java.io.File;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testCalendar();
    }

    private static void testCalendar(){
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DATE);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int seconds = calendar.get(Calendar.SECOND);
        int ms = calendar.get(Calendar.MILLISECOND);

        String imageName = String.format("PIC_%d%02d%02d_%02d%02d%02d%03d.jpg",year,month,day,hour,minute,seconds,ms);
        String dir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath() + File.separator + "Pictures";
        String imagePath = dir + File.separator + imageName;
        Log.e("----",imagePath);
        Log.e("----","ms"+ ms);
    }
}
