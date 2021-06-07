@file:JvmName("ToastUtil")
// 클래스 이름 지정 가능

package com.jessprac.kotlinsample

import android.widget.Toast

// 이렇게 클래스 내부가 아닌 클래스 외부에 선언된 함수는 '최상위 함수' 라고 부름. 모든 코드에서 사용가능

fun toastShort(message:String){
    Toast.makeText(MainApplication.getAppContext(), message, Toast.LENGTH_SHORT).show()
}

fun toastLong(message:String){
    Toast.makeText(MainApplication.getAppContext(), message, Toast.LENGTH_LONG).show()
}

// 코틀린에서는 함수의 기본값을 지정 가능하다.
fun toast(message: String, length: Int = Toast.LENGTH_SHORT){
    Toast.makeText(MainApplication.getAppContext(), message, Toast.LENGTH_SHORT).show()
}