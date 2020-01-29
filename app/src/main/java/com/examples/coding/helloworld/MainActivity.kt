package com.examples.coding.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun onClick(view: View) {
        when(view.id) {
            R.id.btnExecuteTask -> {
                val timesToRun = Integer.parseInt(etUserInput.text.toString())
                tvDisplay.text = fizzBuzz(timesToRun)
            }
        }
    }
    //function functionName(parName: Type) : ReturnType
    fun fizzBuzz(timesOfIter : Int) : String{
        //for(int i = 0; i <= timesOfIter; i++)

        for(i in 0..timesOfIter) {
            var logMessage = ""
            if(i%3 ==0) {
                //sout
                logMessage = "fizz"

            }
            if(i%5 == 0) {
                logMessage = "${logMessage}buzz"
            }
            Log.d("TAG", logMessage)
        }
        return "Complete"
    }
}
