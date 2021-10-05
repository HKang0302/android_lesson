package com.example.androidlesson

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentOne : Fragment() {
    override fun onAttach(context: Context) {
        Log.d("life_cycle", "    override fun onAttach(context: Context) {\n")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("life_cycle", "onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,   // view를 그리는 역할
        container: ViewGroup?,      // 부모뷰
        savedInstanceState: Bundle?
    ): View? {
        Log.d("life_cycle", "onCreateView")

        // fragment가 인터페이스를 처음으로 그릴 때 호출됨
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d("life_cycle", "onViewCreated")
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d("life_cycle", "onActivityCreated")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.d("life_cycle", "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("life_cycle", "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("life_cycle", "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("life_cycle", "onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d("life_cycle", "onDestroyView")
        super.onDestroyView()
    }

    override fun onDetach() {
        Log.d("life_cycle", "onDetach")
        super.onDetach()
    }

}