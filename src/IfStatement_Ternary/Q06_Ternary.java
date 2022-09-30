package IfStatement_Ternary;

import java.util.Scanner;

public class Q06_Ternary {
    public static void main(String[] args) {

        /*
        Kullanicidan bir pozitif tamsayi girmesini isteyin, o pozitif tamsayi 3 basamakli ise
        ekrana "3 basamakli" yazdirin
        3 basamakli degil ise cift olup olmadigini kontrol edin
        cift ise "3 basamakli olmayan cift sayi" yazdirin
        cift sayi deil ise "3 basamakli olmayan tek sayi" yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Pozitif bir sayi giriniz: ");
        int sayi=scan.nextInt();

        String sonuc=(sayi>99 && sayi<1000) ? ("3 basamakli sayi") : (sayi%2==0 ? "3 basamakli olmayan cift sayi" :
                "3 basamakli olmayan tek sayi");
        System.out.println(sonuc);
    }
}
