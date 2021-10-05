package com.example.androidlesson

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Button
import android.widget.EditText

class InternetBrowser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_internet_browser)

        val button: Button = findViewById(R.id.button)
        var uri: EditText = findViewById(R.id.uri)

        button.setOnClickListener {
            val address = uri.text.toString()
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(address))
            startActivity(intent)
        }

        uri.addTextChangedListener(object: TextWatcher{
            override fun afterTextChanged(p0: Editable?) {
                Log.d("edit", "afterTextChanged: "+p0)
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                Log.d("edit", "beforeTextChanged: "+p0)
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                Log.d("edit", "onTextChanged: "+p0)
            }
        })

    }
}