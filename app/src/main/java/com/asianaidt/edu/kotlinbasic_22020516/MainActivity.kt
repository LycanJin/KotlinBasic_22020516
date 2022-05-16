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

        btn_variable.setOnClickListener {

            // 변수 문법 테스트

            var name1 : String // 변수
            val name2 : String // 상수

            // 최초 대입은 둘다 가능
            name1 = "철수"
            name2 = "영희"

            name1 = "준표" // 변수 변경 가능
//            name2 = "대입" // 상수 변경 불가

            // 변수 초기화 테스트
            val year1 = 1998 // Int로 자동 설정
//            year1 = "문자열" // 자료형이 맞지 않아 대입 불가

        }

        btn_condition.setOnClickListener {

            // if 문 테스트
            val userAge = 18

            if (userAge <= 20) {
                Toast.makeText(this, "성인임미당.", Toast.LENGTH_SHORT).show()
            }
            else if (userAge >= 17) {
                Toast.makeText(this, "고딩임미당.", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "중딩 아래 입니당", Toast.LENGTH_SHORT).show()
            }

            // 2. when 테스트
            val num = 30

            when (num) {
                10 -> {
                    Log.d("when 테스트", "10인 경우")
                }
                15 -> Log.d("when 테스트", "15인 경우 - 코드 한줄")
                20, 30, 40 -> Log.d("when 테스트", "20, 30, 40 중 하나")
                in 41..100 -> Log.d("when 테스트", "41 ~ 100 사이의 값")
                else -> Log.d("when 테스트", "그 외의 모든 숫자")
            }

        }

        btn_repeat.setOnClickListener {

            // 1. 정석 - ArrayList 연계
            val studentList = ArrayList<String>()
            studentList.add("홍길동")
            studentList.add("임꺽정")
            studentList.add("장길산")

            for (name in studentList) {
                Log.d("정석 for 문", name)
            }

            // 2. 0~4, 0~5 직전 (자바식 for)
            for (i in 0..4) {
                Log.d("0~4", i.toString())
            }

            for (i in 0 until 5) {
                Log.d("0~5직전", i.toString())
            }

        }

        btn_copy.setOnClickListener {

            // EditText에 입력된 내용을 변수에 담음
            val inputMessage = edt_message.text.toString();

            txt_message.text = inputMessage

        }
    }
}