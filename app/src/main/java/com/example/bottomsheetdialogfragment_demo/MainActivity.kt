package com.example.bottomsheetdialogfragment_demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title ="BottomSheet Dialog"
        textView.setOnClickListener {

            BottomSheetDialog().show(supportFragmentManager, "MainActivity")
        }

    }
}
