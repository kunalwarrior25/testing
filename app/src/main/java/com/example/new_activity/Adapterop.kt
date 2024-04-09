package com.example.new_activity

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class Adapterop(var list:ArrayList<modleop>)
    :RecyclerView.Adapter<Adapterop.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapterop.ViewHolder {
        var item=LayoutInflater.from(parent.context).inflate(R.layout.op,parent,false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder: Adapterop.ViewHolder, position: Int) {
        holder.text.setText(list[position].text)
        holder.image.setImageResource(list[position].image)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(list: View):RecyclerView.ViewHolder(list){
        lateinit var image:ImageView
        lateinit var text:TextView
        init {
            image=list.findViewById(R.id.image3)
            text=list.findViewById(R.id.text2)
            list.setOnClickListener {
                Toast.makeText(list.context,"Hello",Toast.LENGTH_SHORT).show()
            }
        }

    }


}