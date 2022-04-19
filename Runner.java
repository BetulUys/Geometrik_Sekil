package GeometrikSekil;

import java.util.Scanner;


public class Runner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Hesaplama Yapmak istediğniz şekli giriniz");
        System.out.println("1) Çember\n2) Kare\n3) Dikdörtgen");
        int islem = scan.nextInt();
        Cember c = new Cember();
        Dikdortgen d = new Dikdortgen();
        Kare k = new Kare();
        switch (islem) {
            case 1:
                System.out.println("Alana hesaplamak için(1)\nÇevre hesaplamak için(2)tuşlayınız");
                islem=scan.nextInt();
                if (islem == 1) {
                    c.cemberAlan();
                } else c.cemberCevre();
                break;
            case 2:
                System.out.println("Alana hesaplamak için(1)\n Çevre hesaplamak için(2)tuşlayınız");
                islem=scan.nextInt();
                if (islem == 1) {
                    k.kareAlan();
                } else k.kareCevre();
                break;
            case 3:
                System.out.println("Alana hesaplamak için(1)\n Çevre hesaplamak için(2)tuşlayınız");
                islem=scan.nextInt();
                if (islem == 1) {
                    d.dikdortgenAlan();
                } else d.dikdortgenCevre();
                break;
        }

    }
}