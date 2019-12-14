package com.thenewboston.my_todo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        floating_button_add.setOnClickListener{
            val intent = Intent(this,AddTaskActivity ::class.java)
            startActivity(intent)
        }
    }
}
