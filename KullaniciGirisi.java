package myOwnWork;

import java.util.Scanner;

public class KullaniciGirisi {
        public static void main(String[] args) {
            String kullaniciAdi, sifre;
            int yeniSifre,secim;


            Scanner input = new Scanner(System.in);
            System.out.print("Kullanıcı adınızı giriniz: ");
            kullaniciAdi = input.nextLine();
            System.out.print("Şifreniz: ");
            sifre = input.nextLine();


            boolean kullanici= kullaniciAdi.equals("yigit");
            boolean sifresi = sifre.equals("123");


            if (kullanici ==true && sifresi == true)
                System.out.println("Doğru! Giriş yapıldı");


            else if(kullanici ==true && sifresi == false) {
                System.out.print("Şifreniz yanlış.Şifrenizi sıfırlamak istiyorsanız 1'e basınız.\nCıkış yapmak istiyorsanız 0'a basınız ");
                secim =input.nextInt();

                switch(secim) {
                    case 0:
                        System.out.println("Sistemden çıkıldı");
                        System.exit(0);

                    case 1 :
                        Scanner inp = new Scanner(System.in);
                        System.out.print("Oluşturmak istediğiniz yeni şifrenizi giriniz: ");
                        yeniSifre = inp.nextInt();

                        if(yeniSifre == 12345) {
                            System.out.println("Şifreniz eski şifrenizden farklı olmalıdır\nLütfen tekrar deneyiniz");
                        }
                        else {
                            System.out.println("Şifreniz değiştirildi.Yeni şifreniz: "+yeniSifre);
                        }

                        break;
                }
            }


            else
                System.out.println("Kullanıcı bulunamadı..");
        }

}
