package GeometrikSekil;

import java.util.Scanner;

public class Cember extends Sekil{
 static Scanner scan=new Scanner(System.in);

   public void cemberAlan(){
       System.out.println("yarıçap giriniz");
       super.yaricap=scan.nextDouble();
       System.out.println("Çember Alanı= "+ 3*yaricap*yaricap);

   }
   public void cemberCevre(){
       System.out.println("yarıçap giriniz");
       super.yaricap=scan.nextDouble();
       System.out.println("Çember Çevresi= "+ 3*yaricap*2);

   }
}
