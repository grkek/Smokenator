package com.madgallbladder.smokenator

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun IntRange.random() =
            Random().nextInt((endInclusive + 1) - start) +  start

    private fun Calculate(amount : Int) : Double{

        //Calculate the time spent
        var timeSpent = amount * (2..4).random().toDouble()

        //Return it as a double
        return timeSpent
    }

    fun Submit(view : View){
        //Call a calculate function with the packAmount parameter
        var timeSpent = Calculate(cigaretteAmountText.text.toString().toInt())

        //Create an intent and add the timeSpent variable to it
        var intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("timeSpent", timeSpent)

        //Start the result activity
        startActivity(intent)
    }
}
