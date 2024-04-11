package com.example.new_activity.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.new_activity.MainActivity
import com.example.new_activity.R
import com.example.new_activity.chatbox.chatAdapter
import com.example.new_activity.chatbox.modlechat

class a1 : Fragment() {
    lateinit var list1:RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        list1 = view.findViewById(R.id.list1)

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

        list1.layoutManager= LinearLayoutManager(view.context, LinearLayoutManager.VERTICAL,false)
        var adat = chatAdapter(mylist)
        list1.adapter=adat
    }
}