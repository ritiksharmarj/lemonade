package com.ritiksharmarj.lemonade

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image_lemon_state.setOnClickListener {
            Toast.makeText(this, "Pick a lemon", Toast.LENGTH_SHORT).show()
        }
    }
}