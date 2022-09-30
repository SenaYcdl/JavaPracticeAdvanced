package IfStatement_Ternary;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {

        /*
        Kullanicidan boyunu CM ve kilosunu kg olarak BMI hesaplayiniz

        BMI=kilo/(boy*boy)
        Bmi<=20 oldukca zayifsiniz
        20<Bmi<=25 normal sinirlardasiniz
        25<bmi<=30 sismansiniz
        30<bmi obez grubundasiniz
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Boyunuzu cm olarak giriniz:");
        double boy=scan.nextDouble();
        System.out.println("Kilonuzu giriniz:");
        double kilo=scan.nextDouble();
        double bmi=kilo/((boy/100)*(boy/100));

        if (bmi<=20) {
            System.out.println("Oldukca zayifsiniz");
        } else if (bmi>20 & bmi<=25) {
            System.out.println("Normal sinirlardasiniz");
        } else if (bmi>25 & bmi<=30) {
            System.out.println("Sismansiniz");
        } else if (bmi>30) {
            System.out.println("Obez grubundasiniz");
        }else
            System.out.println("Hatali giris yaptiniz");
    }
}
