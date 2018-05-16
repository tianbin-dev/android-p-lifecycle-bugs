package com.example.lifecyclebugs

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("ThirdActivity", "onCreate()")

        setContentView(R.layout.activity_third)
    }

    override fun onResume() {
        super.onResume()
        Log.d("ThirdActivity", "onResume()")
    }
}
