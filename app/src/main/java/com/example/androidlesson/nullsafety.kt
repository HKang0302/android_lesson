package com.example.androidlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class nullsafety : AppCompatActivity() {

    lateinit var lateCar: Car

    class Car(var number:Int){

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nullsafety)

        val number: Int = 10
        val number1: Int? = null

        val number3 = number1?.plus(number)
        Log.d("number", ""+number3)

        // 삼항연산자 -> 엘비스 연산자
        val number4 = number1 ?: 10 // null이면 number1, 아니면 10
        Log.d("number", ""+number4)

        // lateinit
        lateCar = Car(10)
        Log.d("number", "late Number: "+lateCar.number)

    }

    fun plus(a:Int, b:Int?): Int{
        if(b != null)
            return a+b
        else
            return a
    }
}