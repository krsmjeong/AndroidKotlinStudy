package com.jessprac.kotlinsample;

public class PersonJava {

    // 나이
    private int age;

    // 이름. 변경불가
    private final String name;

    // 닉네임 - 소문자만 허용
    private String nickname;

    // 생성자에서 이름을 받는다.
    public PersonJava(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    // 닉네임은 대문자 문자열이 와도 소문자로 저장한다.

    public void setNickname(String nickname) {
        this.nickname = nickname.toLowerCase();
    }
}
