package com.example.myapplication2

import android.annotation.SuppressLint
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication2.Adapter.Adapter
import com.example.myapplication2.Adapter.Adapter_community
//import kotlin.coroutines.jvm.internal.CompletedContinuation.context

class explore_community : Fragment() {

    var arr_name  = arrayOf(
        "Suhani",
        "The kamath Center",
        "Madhu Goel",
        "Sanjeev ji",
        "Kiran",
        "Aman",
        "Prem rajan",
        "Jatin",
        "Monika",
        "Aakansha rai",
        "Kiran",
        "Thomas cook",
        "Aayat",
        "Prem kumar sharma",
        "Ankurit",
        "Sanjay varma"
    )
    var Location = arrayOf(
        "Sangam Vihar, New Delhi",
        "Sangam Vihar, New Delhi",
        "Gurugram, Haryana",
        "Noida, UP",
        "Sangam Vihar, New Delhi",
        "Noida, UP",
        "Hamdard nagar, New Delhi",
        "Asola bhati, New Delhi",
        "Noida, UP",
        "Gurugram, Haryana",
        "Govindpuri, New Delhi",
        "Sangam Vihar, New Delhi",
        "Asola bhati, New Delhi",
        "Gurugram, Haryana",
        "Noida, UP",
        "Sangam Vihar, New Delhi"
    )

    var Hobbies = arrayOf(
        "Hi Community! We have great deal for you. Check us out!!",
        "Hi Community! We have great deal for you. Check us out!!",
        "Hi Community! We have great deal for you. Check us out!!",
        "Hi Community! We have great deal for you. Check us out!!",
        "Hi Community! We have great deal for you. Check us out!!",
        "Hi Community! We have great deal for you. Check us out!!",
        "Hi Community! We have great deal for you. Check us out!!",
        "Hi Community! We have great deal for you. Check us out!!",
        "Hi Community! We have great deal for you. Check us out!!",
        "Hi Community! We have great deal for you. Check us out!!",
        "Hi Community! We have great deal for you. Check us out!!",
        "Hi Community! We have great deal for you. Check us out!!",
        "Hi Community! We have great deal for you. Check us out!!",
        "Hi Community! We have great deal for you. Check us out!!",
        "Hi Community! We have great deal for you. Check us out!!",
        "Hi Community! We have great deal for you. Check us out!!",

        )
    var Description = arrayOf(
        "Laboratory",
        "General Hospital",
        "University",
        "General Hospital",
        "Beauty parlor",
        "Application store",
        "Pharmacy",
        "Travel Agency",
        "University",
        "General Hospital",
        "Laboratory",
        "Beauty parlor",
        "Laboratory",
        "Pharmacy",
        "Jeweler",
        "Travel Agency"
    )
    var arr_image = intArrayOf(
        R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5,
        R.drawable.image4, R.drawable.image5, R.drawable.image1, R.drawable.image5,
        R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4,
        R.drawable.image5, R.drawable.image1, R.drawable.image2, R.drawable.image3,
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_explore_community, container, false)

        val filter : ImageButton = view.findViewById(R.id.filters)
        val dialog : Dialog? = context?.let { Dialog(it) }

        filter.setOnClickListener {
            dialog?.setContentView(R.layout.filter)
            dialog?.window!!.setLayout(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
            dialog.setCancelable(false)
            dialog.window!!.attributes.windowAnimations = R.style.animation

            val clear = dialog.findViewById<TextView>(R.id.clear)
            val close = dialog.findViewById<ImageView>(R.id.filterCancelImage)

            clear.setOnClickListener(View.OnClickListener {
                dialog.dismiss()
                Toast.makeText(context, "Filter cleared", Toast.LENGTH_SHORT).show()
            })
            close.setOnClickListener (View.OnClickListener {
                dialog.dismiss()
                Toast.makeText(context, "Filter close", Toast.LENGTH_SHORT).show()
            })

            dialog.show()
        }


//==================  RECYCLER VIEW - DATA  =======================================================

        val peopleList : RecyclerView = view.findViewById(R.id.communityList)
        val MyAdapter = Adapter_community(arr_image, arr_name, Location, Hobbies, Description)

        peopleList.layoutManager = LinearLayoutManager(context)
        peopleList.adapter = MyAdapter
        return view
    }
}