package com.example.friendsr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    fun abrirActivity1(){
        val intent = Intent(this, objectDetails::class.java)
        startActivity(intent)
    }

    fun abrirActivity2(){
        val intent = Intent(this, objectDetails2::class.java)
        startActivity(intent)
    }

    fun abrirActivity3(){
        val intent = Intent(this, ObjectDetails3::class.java)
        startActivity(intent)
    }

    fun abrirActivity4(){
        val intent = Intent(this, objectDetails4::class.java)
        startActivity(intent)
    }

    fun harleyDavidsonInfo(view: View) {

        abrirActivity1()

    }
    fun bmwInfo(view: View) {

        abrirActivity2()

    }
    fun royalEnfieldInfo(view: View) {

        abrirActivity3()

    }
    fun suzukiInfo(view: View) {

        abrirActivity4()

    }
}
