package com.pnuema.android.foursite.main_stuff


import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.pnuema.android.foursite.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_open.*

class OpenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open)

        button1.setOnClickListener(){
            Log.i("OpenActivity", "Button was Clicked")

            val intent= Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}