package baekjoon;

import java.util.Scanner;

public class q9498 {
    public static void main(String[] args) {
        //시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을
        Scanner sc = new Scanner(System.in);

        int a;

        a = sc.nextInt();

        if (a>=90 && a<=100) {
            System.out.println("A");
        } else if (a>=80 && a<=89) {
            System.out.println("B");
        } else if (a>=70 && a<=79) {
            System.out.println("C");
        } else if (a>=60 && a<=69) {
            System.out.println("D");
        }
        else {System.out.println("F");}
    }
}
