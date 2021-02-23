package com.tarun.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.tarun.test.ui.auth.SignUpActivity
import com.tarun.test.ui.auth.login

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            val intent = Intent(this, login::class.java)
            startActivity(intent)
    }
}