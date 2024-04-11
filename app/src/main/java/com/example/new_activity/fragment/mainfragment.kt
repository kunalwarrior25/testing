package com.example.new_activity.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.new_activity.R

class mainfragment : AppCompatActivity() {
    lateinit var aa1:Button
    lateinit var aa2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainfragment)
        aa1=findViewById(R.id.relate_a1)
        aa2=findViewById(R.id.relate_a2)

        aa1.setOnClickListener(){
            var myfrag:Fragment=a1()
            val myfra:FragmentTransaction=supportFragmentManager.beginTransaction()
            myfra.replace(R.id.op,myfrag).commit()
        }
        aa2.setOnClickListener(){
            var myfrag:Fragment=a2()
            val myfra:FragmentTransaction=supportFragmentManager.beginTransaction()
            myfra.replace(R.id.op,myfrag).commit()
        }
    }
}