package com.example.myapplication2

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication2.Adapter.Adapter

class explore_people : Fragment() {

    var arr_name  = arrayOf(
        "Aakansha rai",
        "Jatin",
        "Monika",
        "Rohit",
        "Kiran",
        "Aman",
        "Aayat",
        "Jatin",
        "Monika",
        "Rohit",
        "Kiran",
        "Aman",
        "Aayat",
        "Jatin",
        "Monika",
        "Rohit"
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
        "Hi community! I am open to work if there is any chance. I am glad to connect.",
        "Hi community! I am open to work if there is any chance. I am glad to connect.",
        "Hi community! I am open to work if there is any chance. I am glad to connect.",
        "Hi community! I am open to work if there is any chance. I am glad to connect.",
        "Hi community! I am open to work if there is any chance. I am glad to connect.",
        "Hi community! I am open to work if there is any chance. I am glad to connect.",
        "Hi community! I am open to work if there is any chance. I am glad to connect.",
        "Hi community! I am open to work if there is any chance. I am glad to connect.",
        "Hi community! I am open to work if there is any chance. I am glad to connect.",
        "Hi community! I am open to work if there is any chance. I am glad to connect.",
        "Hi community! I am open to work if there is any chance. I am glad to connect.",
        "Hi community! I am open to work if there is any chance. I am glad to connect.",
        "Hi community! I am open to work if there is any chance. I am glad to connect.",
        "Hi community! I am open to work if there is any chance. I am glad to connect.",
        "Hi community! I am open to work if there is any chance. I am glad to connect.",
        "Hi community! I am open to work if there is any chance. I am glad to connect.",
    )
    var Description = arrayOf(
        "Hi community! I am open to work if there is any chance. I am a Android developer with lots of skills like Kotlin, REST API, Firebase, still I am jobless and my friends got a job.",
        "Hi community! I am open to work if there is any chance. I am a Android developer with lots of skills like Kotlin, REST API, Firebase, still I am jobless and my friends got a job.",
        "Hi community! I am open to work if there is any chance. I am a Android developer with lots of skills like Kotlin, REST API, Firebase, still I am jobless and my friends got a job.",
        "Hi community! I am open to work if there is any chance. I am a Android developer with lots of skills like Kotlin, REST API, Firebase, still I am jobless and my friends got a job.",
        "Hi community! I am open to work if there is any chance. I am a Android developer with lots of skills like Kotlin, REST API, Firebase, still I am jobless and my friends got a job.",
        "Hi community! I am open to work if there is any chance. I am a Android developer with lots of skills like Kotlin, REST API, Firebase, still I am jobless and my friends got a job.",
        "Hi community! I am open to work if there is any chance. I am a Android developer with lots of skills like Kotlin, REST API, Firebase, still I am jobless and my friends got a job.",
        "Hi community! I am open to work if there is any chance. I am a Android developer with lots of skills like Kotlin, REST API, Firebase, still I am jobless and my friends got a job.",
        "Hi community! I am open to work if there is any chance. I am a Android developer with lots of skills like Kotlin, REST API, Firebase, still I am jobless and my friends got a job.",
        "Hi community! I am open to work if there is any chance. I am a Android developer with lots of skills like Kotlin, REST API, Firebase, still I am jobless and my friends got a job.",
        "Hi community! I am open to work if there is any chance. I am a Android developer with lots of skills like Kotlin, REST API, Firebase, still I am jobless and my friends got a job.",
        "Hi community! I am open to work if there is any chance. I am a Android developer with lots of skills like Kotlin, REST API, Firebase, still I am jobless and my friends got a job.",
        "Hi community! I am open to work if there is any chance. I am a Android developer with lots of skills like Kotlin, REST API, Firebase, still I am jobless and my friends got a job.",
        "Hi community! I am open to work if there is any chance. I am a Android developer with lots of skills like Kotlin, REST API, Firebase, still I am jobless and my friends got a job.",
        "Hi community! I am open to work if there is any chance. I am a Android developer with lots of skills like Kotlin, REST API, Firebase, still I am jobless and my friends got a job.",
        "Hi community! I am open to work if there is any chance. I am a Android developer with lots of skills like Kotlin, REST API, Firebase, still I am jobless and my friends got a job."
    )
    var arr_image = intArrayOf(
        R.drawable.image1, R.drawable.image2, R.drawable.image3,
        R.drawable.image4, R.drawable.image5, R.drawable.image1, R.drawable.image5,
        R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5,
        R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4,
        R.drawable.image5
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_explore_people, container, false)

        val filter : ImageButton = view.findViewById(R.id.filters)
        val dialog : Dialog? = context?.let { Dialog(it) }



//=================== THIS DIALOG BOX IS STACKED WITH THE SCREEN INSTEAD OF CLOSING - I am working on it ==========================

//        filter.setOnClickListener {
//            dialog?.setContentView(R.layout.filter)
//            dialog?.window!!.setLayout(
//                ViewGroup.LayoutParams.MATCH_PARENT,
//                ViewGroup.LayoutParams.MATCH_PARENT
//            )
//            dialog.setCancelable(false)
//            dialog.window!!.attributes.windowAnimations = R.style.animation

//            val clear = dialog.findViewById<ImageView>(R.id.clear)
////            val close = dialog.findViewById<ImageView>(R.id.filterCancelImage)
//            clear.setOnClickListener(View.OnClickListener {
//                dialog.dismiss()
//                Toast.makeText(context, "Filter cleared", Toast.LENGTH_SHORT).show()
//            })
//            close.setOnClickListener (View.OnClickListener {
//                dialog.dismiss()
//                Toast.makeText(context, "Filter close", Toast.LENGTH_SHORT).show()
//            })
//            dialog.show()
//        }


//==================  RECYCLER VIEW - DATA  =======================================================

        val peopleList : RecyclerView = view.findViewById(R.id.peopleList)
        val MyAdapter : Adapter = Adapter(arr_image, arr_name, Location, Hobbies, Description)

        peopleList.layoutManager = LinearLayoutManager(context)
        peopleList.adapter = MyAdapter

        return view
    }

}