package com.example.collapsibletoolbarlayoutapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.all_listings_each_item.view.*


class AllListsAdapter(var context: Context, var listDetails:ArrayList<AllLists>): RecyclerView.Adapter<AllListsAdapter.view>(){

    inner class view(var inner_view: View): RecyclerView.ViewHolder(inner_view){
        fun bindData(data: AllLists, position: Int) {
            itemView.text1.text = data.text1
            itemView.text2.text = data.text2
            itemView.text3.text = data.text3
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): view {
        val v = LayoutInflater.from(context).inflate(R.layout.all_listings_each_item,parent,false)
        return view(v)
    }

    override fun onBindViewHolder(holder: view, position: Int) {
        val pos=listDetails[position]
        holder.bindData(pos,position)
    }

    override fun getItemCount(): Int {
        return listDetails.size
    }


}