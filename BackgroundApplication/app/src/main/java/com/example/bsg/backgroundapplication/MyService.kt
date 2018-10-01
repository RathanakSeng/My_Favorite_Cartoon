package com.example.bsg.backgroundapplication

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.provider.Settings
import android.util.Log
import android.widget.Toast

class MyService : Service()
{
    lateinit var player: MediaPlayer
    override fun onBind(intent: Intent): IBinder
    {
        return null!!
    }

    override fun onCreate()
    {
        super.onCreate()
        Toast.makeText(this, "Service created...", Toast.LENGTH_LONG)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int
    {
        super.onStartCommand(intent, flags, startId)

        Toast.makeText(this, "Service started...", Toast.LENGTH_LONG).show()
        player = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI)
        player.isLooping = true
        player.start()
        return START_STICKY
    }

    override fun onDestroy()
    {

        super.onDestroy()
        Toast.makeText(this, "Service destroyed...", Toast.LENGTH_LONG).show()
        player.stop()
    }
}
