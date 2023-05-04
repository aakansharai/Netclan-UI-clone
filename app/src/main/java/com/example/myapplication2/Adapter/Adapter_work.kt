package com.example.myapplication2.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication2.R

class Adapter_work(arrayImage: IntArray, arrName: Array<String>, arrLocation: Array<String>, arrStatus: Array<String>, arrDesc: Array<String>) : RecyclerView.Adapter<Adapter_work.MyViewHolder>() {

    var arr_image: IntArray
    var arr_name: Array<String>
    var arr_location: Array<String>
    var arr_status: Array<String>
    var arr_desc: Array<String>
    init {
        arr_image = arrayImage
        arr_name = arrName
        arr_location = arrLocation
        arr_status = arrStatus
        arr_desc = arrDesc
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater : LayoutInflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.work_list_card, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return arr_image.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.image.setImageResource(arr_image[position])
        holder.name.text = arr_name[position]
        holder.location.text = arr_location[position]
        holder.status.text = arr_status[position]
        holder.description.text = arr_desc[position]
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image : ImageView = itemView.findViewById(R.id.peopleListImageView)
        var name : TextView = itemView.findViewById(R.id.peopleCardName)
        var location : TextView = itemView.findViewById(R.id.peopleCardLocation)
        var status : TextView = itemView.findViewById(R.id.peopleCardStatus)
        var description : TextView = itemView.findViewById(R.id.peopleCardDescription)
    }
}

