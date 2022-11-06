import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
        double tutar;
        double kdvOran;
        double kdvTutar;
        double kdvliTutar;
        boolean kdvDurumu;

        //Kullanıcıdan Veri al
        Scanner sc=new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.print("Ücret Tutarını Giriniz: ");
        tutar=sc.nextDouble();

        //Tutar miktarını kontrol et
        kdvDurumu=(0<tutar) && (tutar<1000);
        kdvOran=kdvDurumu ? 0.18d: 0.08d;

        //KdvTutar ve KdvliTutar hesapla
        System.out.println("--------------------------------------");
        System.out.println("Girilen tutar "+ kdvOran + " KDV oranında hesaplanacaktır.");
        kdvTutar=tutar*kdvOran;
        kdvliTutar=kdvTutar+tutar;

        //Ekrana Yazdır
        System.out.println("--------------------------------------");
        System.out.println("| KDV'siz Tutar:| "+tutar);
        System.out.println("| --------------|--------------------|");
        System.out.println("| KDV oranı    :| "+kdvOran);
        System.out.println("| --------------|--------------------|");
        System.out.println("| KDV Tutarı   :| "+kdvTutar);
        System.out.println("| --------------|--------------------|");
        System.out.println("| KDV'li Tutarı:| "+kdvliTutar);
        System.out.println("--------------------------------------");
    }
}
