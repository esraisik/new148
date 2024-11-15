package day01;

import java.util.Scanner;

public class C02 {

    public static void main(String[] args) {
        int a=128;
        int b =17;

        System.out.println("c= " + (a+b));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayi giriniz  :  ");

        int sayi = scanner.nextInt();

        if (sayi %2==0) {
            System.out.println("Girdiğiniz sayı bir çift sayıdır");
        } else {
            System.out.println("girdiğiniz sayı tek sayıdır");
        }

    }
}
