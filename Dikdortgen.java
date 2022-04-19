package GeometrikSekil;

import java.util.Scanner;

public class Dikdortgen extends Sekil{
    static Scanner scan=new Scanner(System.in);

    public void dikdortgenAlan(){
        System.out.println("Uzun Kenar giriniz");
        super.genislik=scan.nextDouble();
        System.out.println("Kısa Kenar giriniz");
        super.uzunluk=scan.nextDouble();
        System.out.println("Dikdortgen Alanı= "+ uzunluk*genislik);

    }
    public void dikdortgenCevre(){
        System.out.println("Uzun Kenar giriniz");
        super.genislik=scan.nextDouble();
        System.out.println("Kısa Kenar giriniz");
        super.uzunluk=scan.nextDouble();
        System.out.println("Dikdortgen Çevre= "+ 2*(uzunluk+genislik));


    }
}

