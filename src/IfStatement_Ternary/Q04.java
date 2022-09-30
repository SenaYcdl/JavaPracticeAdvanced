package IfStatement_Ternary;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        /*
        Kullanicidan aracin hizini aliniz
        Trafik cezasinin degerini hesaplayin
        54 hiz siniridir
        Eger hiz siniriniz 55-74 arasinda ise:
        Ceza 100$ dir

        Eger hiziniz 75-84 arasinda ise:
        Ceza 150$

        Eger hiziniz 85-94 arasinda ise:
        Ceza 320$

        Eger hiziniz 94 ten fazla ise:
        Ceza 500$

        ve ayrica eger surucunun ehliyeti yoksa 200$ eklenir

         Orn: hiziniz 77 iken cezaniz 150$ dir ve ehliyetiniz yoksa 350$ olur

        orn:
        currentSpeed(hiziniz) 87
        isDriverLicenceAvailable= true
        sonuc=320$

        Orn:
        currentSpeed(hiziniz) 65
        isDriverLicenceAvailable= false
        sonuc=300$
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Ehliyetiniz var ise 1 yok ise 0 giriniz:");
        int ehliyet = scan.nextInt();

        if (ehliyet == 0 || ehliyet == 1) { // ehliyetin varlik yokluk sartina gore diger kosullar calisacak
            if (ehliyet==0){
                System.out.println("Hizinizi sormadan 200$ ceza aldiniz");
            }

            System.out.print("Hizinizi giriniz: ");
            int hiz = scan.nextInt();


            if (ehliyet == 1) {
                if (hiz < 0) {
                    System.out.println("Negatif hiz olmaz hatali veri girdiniz");
                } else if (hiz >= 55 && hiz < 75) {
                    System.out.println("Ceza 100$ dir");
                } else if (hiz >= 75 && hiz < 84) {
                    System.out.println("Ceza 150$ dir");
                } else if (hiz >= 85 && hiz <= 94) {
                    System.out.println("Ceza 320$ dir");
                } else if (hiz > 94) {
                    System.out.println("Ceza 500$ dir");
                } else
                    System.out.println("Hiz sinirinda yolculuk ediyorsunuz,Hayirli yolculuklar...");


            } else if (ehliyet == 0) {
                if (hiz < 0) {
                    System.out.println("Negatif hiz olmaz hatali veri girdiniz");
                } else if (hiz >= 55 && hiz < 75) {
                    System.out.println("Ceza 300$ dir");
                } else if (hiz >= 75 && hiz < 84) {
                    System.out.println("Ceza 350$ dir");
                } else if (hiz >= 85 && hiz <= 94) {
                    System.out.println("Ceza 520$ dir");
                } else if (hiz > 94) {
                    System.out.println("Ceza 700$ dir");
                } else
                    System.out.println("Hiz sinirinda yolculuk ediyorsunuz, ancak ehliyetsiz oldugunuz icin ceza 200$");
            } else
                System.out.println("Ehliyet var mi yok mu?");
        } else
            System.out.println("Ehliyet var mi yok mu?"); // ehliyet veririsinin hatali olmasi kontrolu
    }
}