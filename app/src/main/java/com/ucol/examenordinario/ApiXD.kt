package com.ucol.examenordinario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import android.content.Intent
import kotlin.concurrent.thread
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class ApiXD : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_api_xd)

        apiCall()
    }
    private fun apiCall(){
        val url="https://nekos.best/api/v1/hug"
        val queue = Volley.newRequestQueue(this)
        val jsonObjectRequest = JsonObjectRequest(
            Request.Method.GET,url,null,
            {
                             Log.d("ApiXD","Llamada de Api Exitosa")
            }, {
                Log.d("ApiXD", "Llamada de Api Fallida")
            }
        )
        queue.add(jsonObjectRequest)
    }

}