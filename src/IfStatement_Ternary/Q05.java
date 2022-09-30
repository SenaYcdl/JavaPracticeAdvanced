package IfStatement_Ternary;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {

        /*
        Kullanicidan 3 farkli sayi isteyiniz ve bu sayilarin en buyuk ve en kucuk
        olanini yazdiriniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("3 sayi giriniz: ");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int sayi3 = scan.nextInt();

        if (sayi1 >= sayi2 && sayi1 >= sayi3) {
            System.out.println(sayi1 + " :en buyuk sayidir");
         if (sayi2 >= sayi3) {
            System.out.println(sayi3 + " :en kucuk sayidir");
        } else {
            System.out.println(sayi2 + " :en kucuk sayidir");
        }

    } else if (sayi2>=sayi1 && sayi2>=sayi3) {
        System.out.println(sayi2 + " :en buyuk sayidir");
        if (sayi1>=sayi3) {
            System.out.println(sayi3 + ":en kucuk sayidir");
        } else {
            System.out.println(sayi1 + ":en kucuk sayidir");
        }

        } else if (sayi3>=sayi1 && sayi3>=sayi2) {
            System.out.println(sayi3 + " :en buyuk sayidir");
            if (sayi1>=sayi2) {
                System.out.println(sayi2 + ":en kucuk sayidir");
            } else {
                System.out.println(sayi1 + ":en kucuk sayidir");
            }
        }
    }
}