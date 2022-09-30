package IfStatement_Ternary;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {

        /*
        Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
        dort islemden biri ile isleme koyup sonucu yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println(" Yapacaginiz Islemi Seciniz:\n Toplam icin 1\n Cikarma icin 2\n Bolme icin 3\n Carpma icin 4");//kullaniciya secim icin islem menusu yazdik
        int islem=scan.nextInt();
        System.out.println(" Lutfen iki tamsayi giriniz :");

       double num1=scan.nextDouble();
       double num2=scan.nextDouble();

       if (islem==1) {
           System.out.println("Toplama isleminin sonucu: " + num1 + "+" + num2 + "=" + (num1 + num2));
       } else if (islem==2) {
           System.out.println("Cikarma isleminin sonucu : " + num1 + "-" + num2 + "=" + (num1 - num2));
       } else if (islem==3) {
           System.out.println("Bolme isleminin sonucu : " + num1 + "/" + num2 + "=" + (num1 / num2));
       } else if (islem==4) {
           System.out.println("Carpma isleminin sonucu : " + num1 + "*" + num2 + "=" + (num1 * num2));
       } else
           System.out.println("Hatali secim yaptiniz");

    }
}
