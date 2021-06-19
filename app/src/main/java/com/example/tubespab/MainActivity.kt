package com.example.tubespab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {
    var viewPager: ViewPager? = null
    var images= intArrayOf(R.drawable.slide1, R.drawable.slide2)
    var myAdapter: MyAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById<ViewPager>(R.id.slider) as ViewPager
        myAdapter = MyAdapter(this, images)
        viewPager!!.adapter = myAdapter
    }
}