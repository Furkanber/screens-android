package com.android_screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_sign_in)
        //setContentView(R.layout.activity_onboarding6)
        
    }

    fun textLoginClick(view: View) {}
}