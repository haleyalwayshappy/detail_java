package org.example.ifExample;

public class IfExample1 {
    public static void main(String[] args) {
        char gender = 'S';
        if (gender == 'F'){
            System.out.println("여성입니다.");
        }else if (gender == 'M'){
            System.out.println("남성입니다.");
        }
        else {
            System.out.println("사람이 아닙니다.");
        }

    }
}
