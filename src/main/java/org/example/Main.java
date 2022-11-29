package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("변수");
        int num =1;
        float fnum = 1.3f;
        String notice = "값이 변하는 수/변수이름은 카멜케이스로, 특수문자는 _와 $만 사용가능, 약어보다는 길게 내용을 풀어서 쓰는것이 좋음 ";

        int numberOfStudent;
        numberOfStudent= 40;


        System.out.println("정수 자료형");
        // 기본형 ; 자바 언어에서 기본적으로 제공해주는 자료형 / 메모리의 크기가 정해져있다. (정수형,문자형,실수형,논리형)
        // 클래스 자료형 ; jdk에서 제공해주는 사용자가 정의한 class / ex) String
        // 정수 자료형 : byte , short , int ,long
        // IntegerTest.java 파일에 실습

        System.out.println("문자 자료형");
        // CharTest.java

        System.out.println("실수와 논리자료형");
        //DoubleTest.java
        //DoubleTest2.java

        System.out.println("상수와 리터럴, 형변환");
        /*상수 ; 변하지 않는수
        * final 을 붙여서 변수를 상수로 변환해준다.
        *
        * 리터럴 ; 프로그램에서 사용하는 모든 숫자, 값,논리값, (ex: 10,3.14,'A' true)
        * 모든 리터럴은 상수 풀(constant pool)에 저장되어있다.
        * */

        /*형변환 ; 서로 다른 자료형의 값이 대입되는 경우 형 변환이 일어난다.
        * 묵시적 형변환 : 작은수에서 큰수로 / 덜 정밀한 수에서 더 정밀한 수로 대입되는 경우
        * 명시적 형변환 : 변환되는 자료  형을 명시 자료의 손실이 발생할 수 있다.
        * */

        System.out.println("연산자");
        System.out.println("1.대입,부호,산술,복합대입,증감연산자");

        /*항과 연산자
        * 항 : 연산에 사용되는 값
        * 연산자 : 항을 이용하여 연산하는 기호
        * 단항 연산자 : 항이 한개인 연산자 ; ++num
        * 이항 연산자 : 항이 두개인 연산자 ; num1 + num2
        * 삼항 연산자 : 항이 세개인 연산자 ; (5>3)?:0;
        *
        * 부호 연산자   OperatorEx1.java
        * */
    }
}