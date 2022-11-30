package org.example.ifExample;

import java.util.Scanner;

public class knitPattern {
    public static void main(String[] args) {
        // 게이지 계산법
         /* 코수 계산법
         * 0. 10cm 기준
         * 1. 내 코수를 입력한다 (내 코수 / 1cm ) 10cm = 20코 -> 1cm에 2코
         * 2. 도안에 있는 게이지를 입력한다.(도안 코수 / 1cm) 10cm = 22코 -> 1cm 에 2.2코
         * 3. 도안에 적혀있는 떠야하는 코수를 입력한다. 총 68코
         * 4. 68 / 2.2  = 30.9cm
         * 5. 30.9x 2 = 61.8코
         *  */
        Scanner myScanner = new Scanner(System.in);
        Scanner designScanner = new Scanner(System.in);
        Scanner countScanner = new Scanner(System.in);

        System.out.println("나의 게이지 코수를 입력하세요.");
        double myGaugeCount =myScanner.nextInt();

        System.out.println("도안 게이지 코수를 입력하세요.");
        double designGaugeCount = designScanner.nextInt();

        System.out.println("도안에서 떠야하는 코수를 입력해주세요 ");
        double designCount = countScanner.nextInt();

        myGaugeCount = myGaugeCount / 10 ;
        designGaugeCount = designGaugeCount / 10;
       double realGauge = designCount/designGaugeCount ;
        realGauge = realGauge * myGaugeCount;

        System.out.println("내가 떠야할 코수는 : "+ realGauge);
//        int totalCount = (myGaugeCount / 10) + (designGaugeCount/10) + (designCount)
    }
}
