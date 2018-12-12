package com.example.android.autocompletetextview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val values1 = resources.getStringArray(R.array.Countrylist)
        val values2 = resources.getStringArray(R.array.Statelist)
        val myadapter1 = ArrayAdapter<String>(this, android .R. layout.simple_list_item_single_choice, values1)
        val myadapter2 = ArrayAdapter<String>(this, android .R . layout.simple_list_item_single_choice , values2)
        actv1.setAdapter(myadapter1)
        actv2.setAdapter(myadapter2)
        actv1.threshold = 2
        actv2.threshold = 3


    }

    fun getResult(v: View) {
        display.text = actv1.text.append(actv2.text).append("\n").append("TRS has won majority votes in Telangana")

    }

}
