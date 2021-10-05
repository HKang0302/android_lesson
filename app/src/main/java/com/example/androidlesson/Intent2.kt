package com.example.androidlesson

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class Intent2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent2)

        var result: Button = findViewById(R.id.result)
        result.setOnClickListener{

            var number1 = intent.getIntExtra("number1", 0)
            var number2 = intent.getIntExtra("number2", 0)

            Log.d("number1", ""+number1)
            Log.d("number2", ""+number2)

            val result = number1 + number2
            val resultIntent = Intent()
            resultIntent.putExtra("result", result)
            setResult(Activity.RESULT_OK, resultIntent)
            finish() // activity 종료
        }
    }
}