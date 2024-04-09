package com.example.new_activity.chatbox

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.new_activity.MainActivity
import com.example.new_activity.R
import com.example.new_activity.adapater_class

class whatsapp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_whatsapp)
        var list = findViewById<RecyclerView>(R.id.listop)

        var mylist:ArrayList<modlechat> = ArrayList()
        var a1 = modlechat(R.drawable.jai_shree_ram,"jai shree ram","jai shree ram","02:26 PM")
        var a2 = modlechat(R.drawable.jai_shree_ram,"jai shree ram","jai shree ram","02:26 PM")
        var a3 = modlechat(R.drawable.jai_shree_ram,"jai shree ram","jai shree ram","02:26 PM")
        var a4 = modlechat(R.drawable.jai_shree_ram,"jai shree ram","jai shree ram","02:26 PM")
        var a5 = modlechat(R.drawable.jai_shree_ram,"jai shree ram","jai shree ram","02:26 PM")
        var a6 = modlechat(R.drawable.jai_shree_ram,"jai shree ram","jai shree ram","02:26 PM")
        var a7 = modlechat(R.drawable.jai_shree_ram,"jai shree ram","jai shree ram","02:26 PM")
        var a8 = modlechat(R.drawable.jai_shree_ram,"jai shree ram","jai shree ram","02:26 PM")

        mylist.add(a1)
        mylist.add(a2)
        mylist.add(a3)
        mylist.add(a4)
        mylist.add(a5)
        mylist.add(a6)
        mylist.add(a7)
        mylist.add(a8)

        list.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        var adat = chatAdapter(mylist)
        list.adapter=adat
        list.setOnClickListener(){
            var op = Intent(this,MainActivity::class.java)
            startActivity(op)
        }
    }
}