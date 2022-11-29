package org.example.variable;

public class IntegerTest {
    public static void main(String[] args){
        byte bs = 127;
        System.out.println(bs);

//        int iVal = 12345678900; > 사용할 수 있는 가용 범위를 넘었다.
//        long lVal = 12345678900; > 4byte가 넘어가는 숫자는 뒤에L을 붙여줘야함
        long lVal = 12345678900L;

    }
}
