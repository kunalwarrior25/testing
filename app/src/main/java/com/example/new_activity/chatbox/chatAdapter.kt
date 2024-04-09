package com.example.new_activity.chatbox

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.new_activity.MainActivity
import com.example.new_activity.R

class chatAdapter(var list:ArrayList<modlechat>): RecyclerView.Adapter<chatAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var item = LayoutInflater.from(parent.context).inflate(R.layout.mychatitem,parent,false)
        return ViewHolder(item)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.image.setImageResource(list[position].image)
        holder.Name.setText(list[position].name)
        holder.text.setText(list[position].text)
        holder.time.setText(list[position].time)

    }
    inner class ViewHolder(lister:View):RecyclerView.ViewHolder(lister){
        lateinit var image:ImageView
        lateinit var Name:TextView
        lateinit var text:TextView
        lateinit var time:TextView
        init{
            image=lister.findViewById(R.id.card_image)
            Name=lister.findViewById(R.id.card_name)
            text=lister.findViewById(R.id.card_text)
            time=lister.findViewById(R.id.card_time)


        }
    }
}