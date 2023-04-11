package ru.synergy.weather;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;

public class SoundService extends Service {
    MediaPlayer mp;
    private String tag;

    @Override
    public IBinder onBind(Intent intent) {
        // TODO Auto-generated method stub
        return null;
    }
    public void onCreate()
    {
        mp = MediaPlayer.create(this, R.raw.pogoda);
        mp.setLooping(true);
    }
    public void onDestroy()
    {
        mp.stop();
    }
    public void onStart(Intent intent,int startid){

        Log.d(tag, "On start");
        mp.start();
    }
}


