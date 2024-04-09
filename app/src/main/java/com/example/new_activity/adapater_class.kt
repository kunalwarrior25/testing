package com.example.new_activity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class adapater_class(var myitemlist:ArrayList<modle_class>):
    RecyclerView.Adapter<adapater_class.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): adapater_class.ViewHolder {
        var myitem=LayoutInflater.from(parent.context).inflate(R.layout.birditem,parent,false)
        return ViewHolder(myitem)
    }

    override fun onBindViewHolder(holder: adapater_class.ViewHolder, position: Int) {
        holder.mytext.setText(myitemlist[position].text)
        holder.myimage.setImageResource(myitemlist[position].image)
    }

    override fun getItemCount(): Int {
        return myitemlist.size
    }
    inner class ViewHolder(Myholditem:View):RecyclerView.ViewHolder(Myholditem){
        lateinit var mytext:TextView
        lateinit var myimage:ImageView
        init {
            mytext=Myholditem.findViewById(R.id.text2)
            myimage=Myholditem.findViewById(R.id.image)
            Myholditem.setOnClickListener(){
                Toast.makeText(Myholditem.context,"Hello",Toast.LENGTH_SHORT).show()
            }
        }

    }
}