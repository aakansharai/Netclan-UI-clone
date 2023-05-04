package com.example.myapplication2

import android.annotation.SuppressLint
import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity() {

    lateinit var drawerLayout : DrawerLayout

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//====================== NAVIGATION BAR ================================

//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val button : ImageView = findViewById(R.id.ToggleBtn)
        drawerLayout = findViewById(R.id.Drawer)

        val closebtn = drawerLayout.findViewById<ImageView>(R.id.closeNavSide)

        button.setOnClickListener {
            drawerLayout.visibility = View.VISIBLE
        }
        closebtn.setOnClickListener {
            drawerLayout.visibility = View.GONE
        }
////
//        button.setOnClickListener{
//            if(drawerLayout.visibility== View.VISIBLE){
//                button.setImageResource(R.drawable.menu_open)
//                drawerLayout.visibility = View.GONE
//            }else{
//                button.setImageResource(R.drawable.close)
//                drawerLayout.visibility = View.VISIBLE
//            }
//        }
//        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
//        drawerLayout.addDrawerListener(toggle)
//        toggle.syncState()


//====================== BOTTOM BUTTON - FRAGMENT REPLACING ================================

        val refineFragment = Refine()
        val exploreFragment = Explore()
        val mainContainer: BottomNavigationView = findViewById(R.id.navigation)

        supportFragmentManager.beginTransaction().replace(R.id.bigContainer, refineFragment)
            .commit()

        mainContainer.setOnItemSelectedListener(NavigationBarView.OnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.refine -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.bigContainer, refineFragment).commit()
                    return@OnItemSelectedListener true
                }

                R.id.explore -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.bigContainer, exploreFragment).commit()
                    return@OnItemSelectedListener true
                }
            }
            false
        })

    }
}