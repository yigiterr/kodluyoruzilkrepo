import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int yol;
        int ucret=10;
        double kmBasina=2.20;
        double toplamtutar;

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gidilen yol mesafesini km olarak giriniz");
        yol=scan.nextInt();

        toplamtutar=(yol*kmBasina)+ucret;
        if (toplamtutar<=20){
            toplamtutar=20;
        }
        System.out.println("Toplam tutar : " + toplamtutar);

    }
}
