package com.example.lifecyclebugs

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("tianbin", javaClass.simpleName + "==>onCreate()")

        setContentView(R.layout.activity_second)
        button_second.setOnClickListener {
            startActivity(Intent(this, ThirdActivity::class.java))
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d("tianbin", javaClass.simpleName + "==>onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("tianbin", javaClass.simpleName + "==>onPause()")
    }
}
