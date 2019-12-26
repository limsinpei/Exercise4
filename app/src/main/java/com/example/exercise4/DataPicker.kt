package com.example.exercise4


import android.app.DatePickerDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_data_picker.*
import java.util.*

/**
 * A simple [Fragment] subclass.
 */
class DataPicker : Fragment() {

    lateinit var btnCheck : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var rootView = inflater.inflate(R.layout.fragment_data_picker, container, false)

        // val Calendar
        val c = Calendar.getInstance()
        val day = c.get(Calendar.DAY_OF_MONTH)
        val month = c.get(Calendar.MONTH)
        var year = c.get(Calendar.YEAR)

        btnCheck = rootView.findViewById(R.id.btnPickDate)

        btnCheck.setOnClickListener{

            val dpd = DatePickerDialog(activity!!, DatePickerDialog.OnDateSetListener

            { view, myear, mmonth, mdayOfMonth ->

                date.setText("" + mdayOfMonth + "/" + (mmonth+1) + "/" + myear)
                year = myear

                (activity as MainActivity?)?.calculate(myear)

            }, year, month, day)



            dpd.show()



            //calculate

        }

            // Inflate the layout for this fragment
            return rootView
        }
}
