import java.util.Scanner;

public class UsluSayi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(System.in);
        System.out.println("sayı giriniz : ");
        int number = sc.nextInt();
        for(int i=1;i<=number;i++){
            System.out.println("taban 4 :"+Math.pow(i, 4));
            System.out.print("taban 5 : "+Math.pow(i, 5));
            System.out.println("");
        }
    }

}
