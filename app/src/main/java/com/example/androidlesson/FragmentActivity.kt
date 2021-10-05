package com.example.androidlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class FragmentActivity : AppCompatActivity(), FragmentOne.OnDataPassListener {

    override fun onDataPass(data: String?) {
        Log.d("pass", ""+data)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        Log.d("life_cycle", "onCreate")

        var button: Button = findViewById(R.id.frag_button)
        var button2: Button = findViewById(R.id.frag_button2)

        // fragment를 동적으로 작동하는 방법
        val frag1 : FragmentOne = FragmentOne()
        val fragmentManager : FragmentManager = supportFragmentManager

        // fragement에 데이터를 넣는 방법
        val bundle: Bundle = Bundle()
        bundle.putString("hello", "hello")
        frag1.arguments = bundle

        button.setOnClickListener {
            // Transaction (작업 단위)
            // fragment replace/add
            val fragTransaction = fragmentManager.beginTransaction()
            fragTransaction.replace(R.id.container, frag1)
            fragTransaction.commit()
        }

        button2.setOnClickListener {
            // fragment remove/detach 하는 방법
            // remove: 없앤 후 다시 나타내게 하고 싶을 때
            // detach: 없앤 후 다시 나타내지 않을 때
            val fragTransaction = fragmentManager.beginTransaction()
            fragTransaction.remove(frag1)
            fragTransaction.commit()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("life_cycle", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("life_cycle", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("life_cycle", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("life_cycle", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("life_cycle", "onDestroy")
    }
}