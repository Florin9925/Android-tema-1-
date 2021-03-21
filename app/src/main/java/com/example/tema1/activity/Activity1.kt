package com.example.tema1.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tema1.R
import com.example.tema1.`interface`.ActivityFragmentCommunication

class Activity1 : ActivityFragmentCommunication, AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)
    }

    override fun openMainActivity() {
        startActivity(Intent(this, Activity2::class.java))
    }

    override fun replaceFragment() {
        TODO("Not yet implemented")
    }

    override fun replaceF2A2ToF3A2() {
        TODO("Not yet implemented")
    }

    override fun goBackF1A2() {
        TODO("Not yet implemented")
    }
}