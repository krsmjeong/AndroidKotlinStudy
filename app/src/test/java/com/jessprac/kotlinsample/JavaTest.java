package com.jessprac.kotlinsample;

import org.junit.Assert;
import org.junit.Test;

public class JavaTest {
    @Test
    public void test1() {
        Assert.assertEquals(4, 2+2);
    }

    @Test
    public void testGetterSetter() {
        // PersonJava 클래스의 객체를 생성하고 이름을 "John" 나이를 20으로 설정
        PersonJava personJava = new PersonJava("John");
        personJava.setAge(20);

        // 설정한 값이 정상적인지 테스트
        Assert.assertEquals(20, personJava.getAge());
        Assert.assertEquals("John", personJava.getName());

        // 코틀린의 Person 객체를 생성하고 이름을 "John" 나이를 20으로 설정
        Person person = new Person("John");
        person.setAge(20);

        // 설정한 값이 정상적인지 테스트
        Assert.assertEquals(20, person.getAge());
        Assert.assertEquals("John", person.getName());
    }

    @Test
    public void testSetNickname() {
        // 자바로 작성한 PersonJava 클래스의 객체 생성
        PersonJava personJava = new PersonJava("john");

        // 대문자가 포함된 문자열을 닉네임으로 설정해도 소문자로 저장한다.
        personJava.setNickname("Apple");

        // 대문자가 포함된 문자열이 소문자로 되었는지 확인
        Assert.assertEquals("apple", personJava.getNickname());

        // 코틀린으로 작성한 Person 클래스 생성
        Person person = new Person("john");

        // 대문자가 포함된 문자열을 닉네임으로 설정해도 소문자로 저장한다.
        person.setNickname("Apple");

        // 대문자가 포함된 문자열이 소문자로 되었는지 확인
        Assert.assertEquals("apple", person.getNickname());
    }

    @Test
    public void testSingletonJava() {
        // 생성자를 private 으로 감췄기 때문에 new 로 생성불가 - 주석을 풀면 에러 발생
        // SingletonJava singletonJava = new SingletonJava();

        // 외부에 공개된 getInstance() 메소드로 객체에 접근
        SingletonJava singletonJava = SingletonJava.getInstance();

        // 객체의 메소드 사용가능
        singletonJava.log("hi, singleton");
    }

    @Test
    public void testFruit(){
        FruitJava fruitJava = new FruitJava();
        fruitJava.fruitName = "사과";
        fruitJava.description = "사과는 맛있다.";

        // 객체를 넘기면 자동으로 toString() 메소드 실행
        System.out.println(fruitJava);
    }

    @Test
    public void testFruitEquals(){
        // FruitJava 객체를 2개 생성한다.
        FruitJava fruitJava1 = new FruitJava();
        FruitJava fruitJava2 = new FruitJava();

        // 모든 속성을 같게 한다.
        fruitJava1.fruitName = "바나나";
        fruitJava2.fruitName = "바나나";

        fruitJava1.description = "바나나는 길다.";
        fruitJava2.description = "바나나는 길다.";

        // 두 객체가 같은지 확인
        Assert.assertEquals(fruitJava1, fruitJava2);
    }

    @Test
    public void testFruitHashCode() {
        // FruitJava 객체 2개를 생성한다.
        FruitJava fruitJava1 = new FruitJava();
        FruitJava fruitJava2 = new FruitJava();

        // 모든 속성을 같게 한다.
        fruitJava1.fruitName = "바나나";
        fruitJava2.fruitName = "바나나";

        fruitJava1.description = "바나나는 길다.";
        fruitJava2.description = "바나나는 길다.";

        // 두 객체가 같은지 확인
        Assert.assertEquals(fruitJava1.hashCode(), fruitJava2.hashCode());
    }

    @Test
    public void testNPE1(){
        NPE npe = new NPE();
        // 3글자 단어를 함수에 전달해 결과 테스트
        Assert.assertEquals(3, npe.strLen("abc"));

        // Null 을 전달할때 테스트
        Assert.assertEquals(0, npe.strLen(null));
    }

    @Test
    public void testNullType(){
        Assert.assertEquals(true, null instanceof String);
    }
}
















