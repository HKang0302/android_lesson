package com.example.androidlesson

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts

class Intent1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        var button: Button = findViewById(R.id.change_activity)
        button.setOnClickListener{

            // 명시적 인텐트
//            var intent = Intent(this@Intent1, Intent2::class.java)
//            intent.putExtra("number1", 1)
//            intent.putExtra("number2", 2)
//            startActivityForResult(intent,200)
//
//            /* OLD VERSION
//            // Key, Value 방식
//            intent.putExtra("number1", 1)
//            intent.putExtra("number2", 2)
//            startActivityForResult(intent,200)
//
////            val intent2 = Intent(this@Intent1, Intent2::class.java)
////
////            // Apply
////            intent2.apply{
////                this.putExtra("number1", 1)
////                this.putExtra("number2", 2)
////            }
////            startActivity(intent2)
//            */

            // 암시적 인텐트
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com")) // 두번째 컴포넌트를 보여줘라!
            startActivity(intent)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 200 && resultCode == RESULT_OK){
            Log.d("number", ""+requestCode)
            Log.d("number", ""+resultCode)
            val result = data?.getIntExtra("result", 0)
            Log.d("number", ""+result)
        }
    }
}