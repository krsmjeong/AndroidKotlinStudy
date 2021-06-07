package com.jessprac.kotlinsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            // Intent로 BmiJavaActivity를 타겟으로 지정하고 startActivity로 실행
            startActivity(Intent(this@MainActivity, BmiJavaActivity::class.java))
        }

        button2.setOnClickListener {
            // Intent로 BmiKotlinActivity 를 타겟으로 지정하고 startActivity로 실행
            startActivity(Intent(this@MainActivity, BmiKotlinActivity::class.java))
        }

        button3.setOnClickListener {
            //Intent로 VariableJavaAvtivity 를 타겟으로 지정하고 startActivity 로 실행
            startActivity(Intent(this@MainActivity, VariableJavaActivity::class.java))
        }

        button4.setOnClickListener {
            //Intent로 VariableKotlinAvtivity 를 타겟으로 지정하고 startActivity 로 실행
            startActivity(Intent(this@MainActivity, VariableKotlinActivity::class.java))
        }

        // button5 클릭된 경우의 이벤트 리스너 설정
        button5.setOnClickListener {
            // Intent 로 VariableKotlinActivity 를 타겟으로 지정하고 startActivity 로 실행
            startActivity(Intent(this@MainActivity, ControlJavaActivity::class.java))
        }

        // button6 클릭된 경우의 이벤트 리스너 설정
        button6.setOnClickListener {
            startActivity(Intent(this@MainActivity, ControlKotlinActivity::class.java))
        }
    }
}
















