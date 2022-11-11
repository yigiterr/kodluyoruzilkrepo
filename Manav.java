import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        double armutFiyat=2.14;
        double elmaFiyat=3.67;
        double domatesFiyat=1.11;
        double muzFiyat=0.95;
        double patlicanFiyat=5.00;

        double armutKilo;
        double elmaKilo;
        double domatesKilo;
        double muzKilo;
        double patlicanKilo;

        double toplamaTutar;

        Scanner sc=new Scanner(System.in);


        System.out.print("Armutun Kilonuzu Giriniz (kg): ");
        armutKilo=sc.nextDouble();

        System.out.print("Elmanın Kilonuzu Giriniz (kg): ");
        elmaKilo=sc.nextDouble();

        System.out.print("Domates Kilonuzu Giriniz (kg): ");
        domatesKilo=sc.nextDouble();

        System.out.print("Muzun Kilonuzu Giriniz (kg): ");
        muzKilo=sc.nextDouble();

        System.out.print("Patlıcanın Kilonuzu Giriniz (kg): ");
        patlicanKilo=sc.nextDouble();


        toplamaTutar=armutFiyat*armutKilo + elmaFiyat*elmaKilo + domatesFiyat*domatesKilo + muzFiyat*muzKilo
                + patlicanFiyat*patlicanKilo;



        System.out.println("| Armutun Fiyatı ve Kilosu     : "+armutFiyat+" ve "+armutKilo );

        System.out.println("| Elmanın Fiyatı ve Kilosu     : "+elmaFiyat+" ve "+elmaKilo);

        System.out.println("| Domates Fiyatı ve Kilosu     : "+domatesFiyat+" ve "+domatesKilo);

        System.out.println("| Muzun Fiyatı ve Kilosu       : "+muzFiyat+" ve "+muzKilo);

        System.out.println("| Patlıcanınz Fiyatı ve Kilosu :  "+patlicanFiyat+" ve "+ patlicanKilo);

        System.out.println("| Toplam Tutar                 : "+toplamaTutar);

    }
}
