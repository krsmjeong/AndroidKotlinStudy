package com.jessprac.kotlinsample

class Person {
    // 나이
    var age: Int = 0

    // 닉네임 - 소문자만 허용
    var nickname: String = ""
        set(value) {
            // field 는 Setter 의 대상이 되는 field 를 의미
            field = value.toLowerCase()
        }

    // 이름
    val name: String

    // 생성자에서 이름을 받는다.
    constructor(name: String) {
        this.name = name
    }
}