package com.example.new_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list = findViewById<RecyclerView>(R.id.list)

        var mylistbird:ArrayList<modle_class> = ArrayList()
        var a1=modle_class(R.drawable.jai_shree_ram,"Jai shree ram")
        var a2=modle_class(R.drawable.jai_shree_ram,"Jai shree ram")
        var a3=modle_class(R.drawable.jai_shree_ram,"Jai shree ram")

        mylistbird.add(a1)
        mylistbird.add(a2)
        mylistbird.add(a3)

        list.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        var adaptt = adapater_class(mylistbird)
        list.adapter=adaptt
    }
}