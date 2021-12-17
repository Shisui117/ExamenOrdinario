package com.ucol.examenordinario

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.concurrent.thread
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        Thread.sleep(2000)
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonEnter.setOnClickListener{startActivity(Intent(this, ApiXD::class.java))}
        buttonInfo.setOnClickListener{startActivity(Intent(this, Contacto::class.java))}
    }
}