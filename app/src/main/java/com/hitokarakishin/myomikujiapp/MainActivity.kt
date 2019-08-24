package com.hitokarakishin.myomikujiapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
//import android.R
//import android.widget.TextView
//import android.app.Activity



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getOmikujiButton.setOnClickListener {
//            Log.v("MainActivity", "Button Clicked")
            val results = arrayOf("1.大大吉","2.大吉","3.凶後大吉","4.凶後吉","5.末大吉","6.向大吉","7.吉","8.中吉","9.小吉","10.半吉","11.末小吉","12.末吉","13.小凶後吉","14.後吉","15.吉凶未分末大吉","16.吉凶不分末吉","17.吉凶相半","18.吉凶相交末吉","19.吉凶相央","20.平","21.半凶","22.凶","23.小凶","24.中凶","25.末凶","26.大凶","27.大大凶")

//            val n = Random().nextInt(5)
            val n = Random().nextInt(results.count())

            if (n == 0) {
//                resultTextView.setTextColor(Color.RED)
//                resultTextView.setTextColor(Color.parseColor("#ff0000"))
                resultTextView.setTextColor(Color.argb(255,255,0,0))
            } else {
                resultTextView.setTextColor(Color.parseColor("#808080"))

            }
            resultTextView.text = results.get(n)
        }
    }
}

//class descriptionTextView : Activity() {
//    //ブログのURL定義
//    internal var blogStr = "https://will-kishin.com/4351/"
//
//    public override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.main)
//
//        val blogLink = findViewById<View>(R.id.blog_link) as TextView
//
//        blogLink.text = blogStr
//    }
//}