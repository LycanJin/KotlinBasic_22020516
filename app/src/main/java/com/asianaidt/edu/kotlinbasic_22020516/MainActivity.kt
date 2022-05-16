package com.asianaidt.edu.kotlinbasic_22020516

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_log.setOnClickListener {

            // btn_log 가 클릭되면 들어옴
            Log.d("메인화면", "로그 찍기 버튼 눌림")
        }

        btn_log.setOnLongClickListener {

            Log.d("메인화면", "로그 버튼 길게 눌림!!!!")

            return@setOnLongClickListener true
        }

        btn_toast.setOnClickListener {

            // 토스트를 띄움
            Toast.makeText(this, "테스트용 토스트", Toast.LENGTH_SHORT).show()


        }
    }
}