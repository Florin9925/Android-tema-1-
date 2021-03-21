package com.example.tema1.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.OnBackPressedDispatcher
import com.example.tema1.R
import com.example.tema1.`interface`.ActivityFragmentCommunication
import com.example.tema1.fragment.F1A2
import com.example.tema1.fragment.F2A2
import com.example.tema1.fragment.F3A2
import java.io.Closeable
import kotlin.system.exitProcess

class Activity2 : ActivityFragmentCommunication, AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        addSecondFragment()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()
    }

    override fun openMainActivity() {
        startActivity(Intent(this, Activity2::class.java))
    }

    private fun addSecondFragment() {
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        val tag = F1A2::class.java.name
        val addTransaction = transaction.add(
            R.id.frame_layout_2, F1A2.newInstance("", ""), tag
        )
        addTransaction.commit()
    }

    override fun replaceFragment() {
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        val tag = F2A2::class.java.name
        val replaceTransaction = transaction.replace(
            R.id.frame_layout_2, F2A2.newInstance("", ""), tag
        )
        replaceTransaction.commit()
    }

    override fun replaceF2A2ToF3A2() {
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        val tag = F2A2::class.java.name
        val replaceTransaction = transaction.replace(
            R.id.frame_layout_2, F3A2.newInstance("", ""), tag
        )
        replaceTransaction.commit()
    }

    override fun goBackF1A2() {
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        val tag = F2A2::class.java.name
        val replaceTransaction = transaction.replace(
            R.id.frame_layout_2, F1A2.newInstance("", ""), tag
        )
        replaceTransaction.commit()

    }
}


