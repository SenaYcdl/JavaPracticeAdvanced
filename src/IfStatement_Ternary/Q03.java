package IfStatement_Ternary;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        //kullanicidan aldiginiz koordinat noktasinin hangi bolgede oldugunu yazdiriniz

        Scanner scan=new Scanner(System.in);
        System.out.println("X ve Y degerleri giriniz: ");
        int x=scan.nextInt();
        int y=scan.nextInt();

        if (x>0 && y>0) {
            System.out.println("Girdiginiz degerler 1.bolgeye ait");
        } else if (x<0 && y>0) {
            System.out.println("Girdiginiz degerler 2.bolgeye ait");
        } else if (x<0 && y<0) {
            System.out.println("Girdiginiz degerler 3.bolgeye ait");
        } else if (x>0 && y<0) {
            System.out.println("Girdiginiz degerler 4.bolgeye ait");
        } else if (x!=0 && y==0) {
            System.out.println("Girdiginiz degerler x ekseni uzerindedir");
        } else if (x==0 & y!=0) {
            System.out.println("Girdiginiz degerler y ekseni uzerindedir");
        } else
            System.out.println("Girdiginiz degerler orjindedir");
    }
}
