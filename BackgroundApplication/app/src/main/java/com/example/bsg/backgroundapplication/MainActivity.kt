package com.example.bsg.backgroundapplication

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonStart.setOnClickListener()
        {
            startService(Intent(this, MyService::class.java))
        }
        buttonStop.setOnClickListener()
        {
            stopService(Intent(this, MyService::class.java))
        }
    }
}
