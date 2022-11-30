package org.example.operator;

public class OperatorEx3 {
    public static void main(String[] args) {
        int num1 = 10;
        int i =2;

        boolean value = ((num1=num1+10)<10) || ((i=i+2)<10);
        System.out.println(num1);
        System.out.println(i);
        System.out.println(value);

        // 조건연산자
        /*삼항연산자
        * 조건식?결과1(true일떄) : 결과2(false일때)
        *
        * int num = (5>3) ? 10:20
        * */
        int value1 =  10;
        int value2 = 20;
        int max= (value1>value2)? value1:value2;
        System.out.println(max);

        // 비트연산자


    }
}
