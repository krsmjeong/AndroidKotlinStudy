package com.jessprac.kotlinsample;

import android.widget.Toast;

public class ToastUtilJava {

    // 짧은 토스트 메시지를 보여주는 함수
    public static void toastShort(String message) {
        Toast.makeText(MainApplication.getAppContext(), message, Toast.LENGTH_SHORT).show();
        // getApplicationContext() 메소드는 Activity에서 정의된 메소드.
        // Activity 를 상속받지 않는 이 클래스에서는 사용 불가
        // Activity 상속받으면 토스트메시지를 띄울때마다 Activity를 생성하는 꼴이 되기 때문에 메모리 사용 증가
    }

    // 긴 토스트 메시지를 보여주는 함수
    public static void toastLong(String message) {
        Toast.makeText(MainApplication.getAppContext(), message, Toast.LENGTH_LONG).show();
    }

    // 파라미터에 따라 긴 토스트 메시지, 짧은 토스트 메시지를 보여준다.
    public static void toast(String message, int length){
        Toast.makeText(MainApplication.getAppContext(), message, length).show();
    }

    // 파라미터의 기본값을 사용하기 위해 메소드 오버라이딩
    public static void toast(String message){
        toast(message, Toast.LENGTH_SHORT);
    }

    // 그러나 만약 파라미터가 5개라면, 4번을 오버라이딩 해야함.
    // 코틀린에서는 '파라미터의 기본값'을 지원하여 해결
}
