package org.example.ifExample;

import java.util.Scanner;

public class gradeTest {
    public static void main(String[] args) {
        /*System.out.println("학점을 입력해주세요.");
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        if(grade >=90) {
            System.out.println("당신의 학점은 A 입니다. ");
        }
        else if (grade < 90 ||grade>= 80){
            System.out.println("당신의 학점은 B 입니다. ");
        }
        else if (grade<80||grade>=70){
            System.out.println("당신의 학점은 c 입니다. ");
        }
        else if (grade<70||grade>=60){
            System.out.println("당신의 학점은 d 입니다. ");
        }else {
            System.out.println("당신의 학점은 f 입니다. ");
        }*/
        // > 내가 만든 방법은 좀 하드 코딩인디
        // 아래방법은 조금 더 스마트한방법 이지않을까

        System.out.println("학점을 입력해주세요.");
        Scanner scanner = new Scanner(System.in);
        char grade;
        int score = scanner.nextInt();
        if(score >=90) {
            grade ='A';
        }
        else if (score < 90 ||score>= 80){
            grade ='B';
        }
        else if (score<80||score>=70){
            grade ='C';
        }
        else if (score<70||score>=60){
            grade ='D';
        }else {
            grade ='F';
        }
        System.out.println("당신의 점수는 "+score+"입니다.");
        System.out.println("당신의 학점은 "+grade+"입니다.");
//    조건연산자 어려우니까 예제를 좀 써보자그으
        int a = 20;
        int b = 10;

        int max ;
        max = (a>b)?a:b;
        System.out.println(max);
//         해당 연산자가 가독성은 좀 떨어지는 편이라서 if문으로 쓰는게 좀 더 낫다

    }
}
