package org.example.variable;

public class ImplicitConversion {
    public static void main(String[] args) {
        byte bNum = 10;
        int iNum = bNum;

        System.out.println(bNum);
        System.out.println(iNum);

        int iNum2=20;
        float fNum = iNum2; // 20.0 으로 나옴

        System.out.println(fNum);

        double dNum ;
        dNum = fNum + iNum ;

        System.out.println(dNum); // 30.0으로 화면에 출력됨
    }
}
