package com.madgallbladder.smokenator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        //Get values from the passed-in intent
        val timeSpent = intent.getDoubleExtra("timeSpent", 0.0)

        //Call to the calculate function with the timeSpent variable
        Calculate(timeSpent)
    }

    private fun Calculate(timeSpent : Double){
        //Calculate the hours and display the result
        resultText.text = (timeSpent / 60).toString() + " საათს კარგავთ ყოველდღე სიგარეტის გამო !"
    }
}
