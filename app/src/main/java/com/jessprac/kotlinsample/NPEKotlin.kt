package com.jessprac.kotlinsample

// 코틀린 타입은 기본적으로는 널(null)을 허용하지 않는다.
fun strLenNonNull(str: String): Int {
    //파라미터로 받은 str은 널이 될수 없으므로 안전하다.
    return str.length
}

// 단일 널(null) 가능성이 있다면 타입에 ?를 붙여야 한다.
fun strLenNullable(str:String?):Int {
    // 널 가능성이 있는 str 메소드에 접근하면 에러가 발생한다.
//    return str.length

    // if로 널 체크를 한다.
    if (str != null) {
        // 널체크 이후 str은 String? 타입에서 String 타입으로 스마트 캐스팅된다.
        return str.length
    } else {
        return 0
    }


}

// 문자열 끝 char를 반환한다.
fun strLastCharNullable(str: String?):Char? {
    // ?. 연산자는 str 이 NULL 이면 null이 반환된다.
    return str?.get(str.length - 1) ?: "".single()
}

// let 함수를 이용한 예제
fun strPrintLen(str: String?){
    // let 함수는 수신객체인 str 이 널이면 실행되지 않는다.
    str?.let {print(strLenNonNull(it))}
}