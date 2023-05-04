package com.example.myapplication2

import android.annotation.SuppressLint
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication2.Adapter.Adapter
import com.example.myapplication2.Adapter.Adapter_work

class explore_work : Fragment() {

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
        "New Delhi, within 1.6km",
        "New Delhi, within 2.7km",
        "Delhi, within 2.3km",
        "New Delhi, within 2.7km",
        "New Delhi, within 1.5km",
        "New Delhi, within 4.3km",
        "New Delhi, within 2.0km",
        "Asola bhati, within 2.1km",
        "New Delhi, within 2.7km",
        "Gurugram, within 1.2km",
        "New Delhi, within 2.7km",
        "Sangam Vihar,within 3.5km",
        "Asola bhati, within 3.7km",
        "New Delhi, within 1.1km",
        "Delhi, within 0.9km",
        "Sangam Vihar, within 4.7km"
    )

    var Hobbies = arrayOf(
        "Home Help | 10 year experience",
        "Caterer | 1 year of experience",
        "Designer | 3 year of experience",
        "Modeling | 2 year of experience",
        "Caterer | 4 year of experience",
        "Gynecologist | 3 year of experience",
        "Gynecologist | 6 year of experience",
        "Caterer | 1 year of experience",
        "Astrologer | 2 year of experience",
        "Caterer | 1 year of experience",
        "Gynecologist | 4 year of experience",
        "Caterer | 1 year of experience",
        "Makeup Artist | 10 year of experience",
        "Gynecologist | 6 year of experience",
        "Astrologer | 5 year of experience",
        "Caterer | 10 year of experience",

        )
    var Description = arrayOf(
        "Hi community! I am available at your service! \n" +
                "Caterer",
        "Hi community! I am available at your service! \n" +
                "Home Health care service!",
        "Hi community! I am available at your service! \n" +
                "Caterer",
        "Hi community! I am available at your service! \n" +
                "I am a part time model specialist in make up and jewelry shoots",
        "Hi community! I am available at your service! \n" +
                "Caterer",
        "Hi community! I am available at your service! \n" +
                "Obstetrician-Gynecologist",
        "Hi community! I am available at your service! \n" +
                "Obstetrician-Gynecologist",
        "Hi community! I am available at your service! \n" +
                "Caterer",
        "Hi community! I am available at your service! \n" +
                "Astrologer",
        "Hi community! I am available at your service! \n" +
                "Caterer",
        "Hi community! I am available at your service! \n" +
                "Obstetrician-Gynecologist",
        "Hi community! I am available at your service! \n" +
                "Caterer",
        "Hi community! I am available at your service! \n" +
                "Makeup Artist",
        "Hi community! I am available at your service! \n" +
                "Obstetrician-Gynecologist",
        "Hi community! I am available at your service! \n" +
                "Astrologer",
        "Hi community! I am available at your service! \n" +
                "Caterer",
    )
    var arr_image = intArrayOf(
        R.drawable.image4, R.drawable.image5, R.drawable.image1, R.drawable.image5,
        R.drawable.image2, R.drawable.image3, R.drawable.image1, R.drawable.image2,
        R.drawable.image3, R.drawable.image4, R.drawable.image5, R.drawable.image1,
        R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5
    )
    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_explore_work, container, false)

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
//
//            val clear = dialog.findViewById<ImageView>(R.id.clear)
////            val close = dialog.findViewById<ImageView>(R.id.filterCancelImage)
//            clear.setOnClickListener(View.OnClickListener {
//                dialog.dismiss()
//                Toast.makeText(context, "Filter cleared", Toast.LENGTH_SHORT).show()
//            })
//            close.setOnClickListener (View.OnClickListener {
//                dialog.dismiss()
//                Toast.makeText(context, "Filter close", Toast.LENGTH_SHORT).show()
////            })
//            dialog.show()
//        }



//==================  RECYCLER VIEW - DATA  =======================================================

        val peopleList : RecyclerView = view.findViewById(R.id.workList)
        val MyAdapter = Adapter_work(arr_image, arr_name, Location, Hobbies, Description)

//        val req = view.findViewById<TextView>(R.id.Request)
//        val pending = view.findViewById<TextView>(R.id.pendingRequest)
//        req.setOnClickListener(View.OnClickListener {
//            req.visibility = View.GONE
//            pending.visibility = View.VISIBLE
//        })

        peopleList.layoutManager = LinearLayoutManager(context)
        peopleList.adapter = MyAdapter

        return view
    }


}