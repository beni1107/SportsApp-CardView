package com.example.sportsapp

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SportsAdapter(val sports_list: List<SportModel>)
    : RecyclerView.Adapter<SportsAdapter.SportViewHolder>(){


    class SportViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
       lateinit var sportsImage : ImageView
       lateinit var sportsName : TextView
        init {
            sportsImage = itemView.findViewById<ImageView>(R.id.imageViewCard)
            sportsName = itemView.findViewById<TextView>(R.id.textView)


        }

    }

        override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SportViewHolder {
           return SportViewHolder(
               LayoutInflater.from(parent.context)
                   .inflate(R.layout.card_item_layout,parent,false)
           )
    }

    override fun onBindViewHolder(
        holder: SportViewHolder,
        position: Int
    ) {

        holder.sportsName.text = sports_list[position].sportName
        holder.sportsImage.setImageResource(sports_list[position].sportImg)
    }

    override fun getItemCount(): Int {
        sports_list.size
    }




}