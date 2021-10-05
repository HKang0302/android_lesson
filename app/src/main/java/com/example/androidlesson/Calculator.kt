package com.example.androidlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class Calculator : AppCompatActivity() {
    var old = "0"
    var new = "0"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        val result: TextView = findViewById(R.id.result)
        val reset: TextView = findViewById(R.id.ca)
        val plus: TextView = findViewById(R.id.plus)
        val one: TextView = findViewById(R.id.one)
        val two: TextView = findViewById(R.id.two)
        val three: TextView = findViewById(R.id.three)
        val four: TextView = findViewById(R.id.four)
        val five: TextView = findViewById(R.id.five)
        val six: TextView = findViewById(R.id.six)
        val seven: TextView = findViewById(R.id.seven)
        val eight: TextView = findViewById(R.id.eight)
        val nine: TextView = findViewById(R.id.nine)
        val zero: TextView = findViewById(R.id.zero)

        reset.setOnClickListener{
            Log.d("click", "reset!")
            old = "0"
            new = "0"
            result.setText("0")
        }

        one.setOnClickListener{
            Log.d("click", "clicked 1")
            if(new == "0")
                new = ""
            new += "1"
            result.setText(new)
        }

        two.setOnClickListener{
            Log.d("click", "clicked 2")
            if(new == "0")
                new = ""
            new += "2"
            result.setText(new)
        }

        three.setOnClickListener{
            Log.d("click", "clicked 3")
            if(new == "0")
                new = ""
            new += "3"
            result.setText(new)
        }

        four.setOnClickListener{
            Log.d("click", "clicked 4")
            if(new == "0")
                new = ""
            new += "4"
            result.setText(new)
        }

        five.setOnClickListener{
            Log.d("click", "clicked 5")
            if(new == "0")
                new = ""
            new += "5"
            result.setText(new)
        }

        six.setOnClickListener{
            Log.d("click", "clicked 6")
            if(new == "0")
                new = ""
            new += "6"
            result.setText(new)
        }

        seven.setOnClickListener{
            Log.d("click", "clicked 7")
            if(new == "0")
                new = ""
            new += "7"
            result.setText(new)
        }

        eight.setOnClickListener{
            Log.d("click", "clicked 8")
            if(new == "0")
                new = ""
            new += "8"
            result.setText(new)
        }

        nine.setOnClickListener{
            Log.d("click", "clicked 9")
            if(new == "0")
                new = ""
            new += "9"
            result.setText(new)
        }

        zero.setOnClickListener{
            Log.d("click", "clicked 0")
            if(new != "0")
                new += "0"
            result.setText(new)
        }

        plus.setOnClickListener{
            Log.d("click", "plus")
            old = (old.toLong() + new.toLong()).toString()
            result.setText(old)
            new = "0"
        }

    }
}