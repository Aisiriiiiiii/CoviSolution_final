package com.pnuema.android.foursite.main_stuff

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.pnuema.android.foursite.R
import kotlinx.android.synthetic.main.activity_vaccine.*
import java.nio.file.attribute.AttributeView
import android.net.Uri as Uri

class VaccinationAct: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vaccine)

        back1.setOnClickListener() {
            Log.i("SecondActivity", "Go to previous page",)

            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        c4.setOnClickListener(){
            val intent = packageManager.getLaunchIntentForPackage("nic.goi.aarogyasetu")
            startActivity(intent)

        }
    }
}