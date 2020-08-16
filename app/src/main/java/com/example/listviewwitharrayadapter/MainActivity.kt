package com.example.listviewwitharrayadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val array= arrayOf("SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY", "FRIDAY","SATURDAY")
        val adapter=ArrayAdapter(this, R.layout.main_menu,array)
        val list: ListView = findViewById(R.id.listView)
        list.setAdapter(adapter)
    }
}
