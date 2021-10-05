package com.example.androidlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class Listener : AppCompatActivity() {
    var number = 10
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listener)

        val textView: TextView = findViewById(R.id.hello)
        val image: ImageView = findViewById(R.id.gradient)
        val edit: EditText = findViewById(R.id.edit)

        // 익명함수
        // 1. 람다방식
        textView.setOnClickListener{
            Log.d("click", "Click!!")
            textView.setText("안녕하세요")
            image.setImageResource(R.drawable.dogs_1280p_0)
            number += 10
            Log.d("number", ""+number)
        }

        /*
        // 2. 익명 함수 방식
        textView.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                Log.d("click", "Click!!")
            }
        })

        // 3. 이름이 필요한 경우
        val click = object: View.OnClickListener{
            override fun onClick(v: View?) {
            }
        }
        textView.setOnClickListener(click)
         */

    }
}