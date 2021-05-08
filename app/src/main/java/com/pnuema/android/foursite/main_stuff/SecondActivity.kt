package com.pnuema.android.foursite.main_stuff


import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.pnuema.android.foursite.R
import com.pnuema.android.foursite.mainscreen.ui.MainActivity
import kotlinx.android.synthetic.main.activity_open.*
import kotlinx.android.synthetic.main.activity_two.*

class SecondActivity  : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        c1.setOnClickListener(){
            Log.i("OpenActivity", "Go to Vaccination Page")

            val intent= Intent(this, VaccinationAct::class.java)
            startActivity(intent)
        }

        c2.setOnClickListener(){
            Log.i("OpenActivity", "Go to Medical Facilities Page")

            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        c3.setOnClickListener(){
            Log.i("OpenActivity", "Go to Video Page")

            val intent= Intent(this, VideoAct::class.java)
            startActivity(intent)
        }

        c4.setOnClickListener(){
            Log.i("OpenActivity", "Go to Video Page")

            val intent= Intent(this, VideoAct::class.java)
            startActivity(intent)
        }

    }


}