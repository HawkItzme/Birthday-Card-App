package com.example.bdaycard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    //val name = findViewById<EditText>(R.id.nameText)
    fun createBdayCard(view: View) {
            val name = nameText.editableText.toString()
            val intent = Intent(this, BirthdayCard::class.java)
            intent.putExtra("name",name)
        startActivity(intent)
    }
}