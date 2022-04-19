package GeometrikSekil;

import java.util.Scanner;

public class Kare extends Dikdortgen {
    static Scanner scan=new Scanner(System.in);

    public void kareAlan(){
        System.out.println(" Kenar giriniz");
        super.kenar=scan.nextDouble();
        System.out.println("Kare Alanı= "+ kenar*kenar);

    }
    public void kareCevre(){
        System.out.println(" Kenar giriniz");
        super.kenar=scan.nextDouble();
        System.out.println("Kare Cevresi= "+ 4*kenar);

    }


}
