import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner giris = new Scanner(System.in);


       System.out.println("Tutar giriniz!");
       int tutar = giris.nextInt();
       double kdv = tutar>=0 && tutar<=1000 ? tutar*0.18 : tutar*0.08;
       double toplam=kdv+tutar;
       System.out.println("KDV'siz Fiyat = "+tutar);
       System.out.println("KDV'li Fiyat = "+toplam);
       System.out.println("KDV Tutarı = "+kdv);
        }
}
