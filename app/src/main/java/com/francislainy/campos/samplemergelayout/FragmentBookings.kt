package com.francislainy.campos.samplemergelayout


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.layout_bookings_past.*


class FragmentBookings : Fragment() {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tv_past.text = "hi" // Accessing elements individually works
//        layout_bookings_past.visibility = View.GONE // todo: This line crashes the app. Trying to access the parent included layout
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_bookings, container, false)
    }

}