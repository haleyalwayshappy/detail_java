package org.example.operator;

public class OperatorEx1 {
    // 부호 연산자
    public static void main(String[] args) {
        int num1 =-10;
        int num2 = 20;

        /* + 는 부호를 유지하는 연산자  */
        System.out.println(+num1);
        System.out.println(+num2);

        /* - 는 부호를 변경해준다.*/
        System.out.println(-num1);
        System.out.println(-num2);

        /* 부호연산자의 역할은 그 값을 가져와서 참조하여 결과값을 가지고 사용 하는것 변수자체를 변경해주지는 않음 */

        num1 = -num1 ;
//        이렇게 사용해야 변수가 변경되는것


        //산술연산자
        // 더하기빼기나누기곱하기는 이미 알고있어서 생략 나머지 연산자는 기억하기 위해 기록
        int num3 =  10%3 ;
        System.out.println(num3);


        // 복합대입 연산자
        int num4 = 10;

        num4 +=2 ;
        System.out.println(num4);

        // 증감연산자(증가 감소 연산자)
        // ++ -- 코드할때 변수 앞에쓸건지 뒤에 쓸건지 잘 생각해서 사용해야함


    }
}
