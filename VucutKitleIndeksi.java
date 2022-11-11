import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double boy;
        double kilo;
        double vucutKitleIndeksi;

        Scanner sc = new Scanner(System.in);


        System.out.print("Boyunuzu Giriniz (metre): ");
        boy = sc.nextDouble();


        System.out.print("Kilonuzu Giriniz (kg) : ");
        kilo = sc.nextDouble();


        vucutKitleIndeksi = kilo / (boy * boy);


        System.out.println("| Boyunuz               : " + boy);

        System.out.println("| Kilonuz               : " + kilo);

        System.out.println("| Vücut Kitle İndeksiniz: " + vucutKitleIndeksi);


    }
}
