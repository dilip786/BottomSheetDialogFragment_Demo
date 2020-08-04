package com.example.bottomsheetdialogfragment_demo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottomSheetDialog : BottomSheetDialogFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        val view: View = inflater.inflate(R.layout.bottom_menu, container)

        // My Profile onClick
        view.findViewById<TextView>(R.id.tvFirst).setOnClickListener {
            dialog!!.dismiss()
            Toast.makeText(activity, "My Profile Clicked", Toast.LENGTH_LONG).show()
        }

        // My Orders onClick
        view.findViewById<TextView>(R.id.tvSecondView).setOnClickListener {
            dialog!!.dismiss()
            Toast.makeText(activity, "My Orders Clicked", Toast.LENGTH_LONG).show()
        }

        return view
    }
}