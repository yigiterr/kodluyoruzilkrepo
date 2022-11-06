package myOwnWork;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int math, science, chemical, turkish, history, music;
        Scanner inp = new Scanner(System.in);

        System.out.print("Turkce Notunuz:");
        turkish = inp.nextInt();

        System.out.print("Tarih Notunuz:");
        history = inp.nextInt();

        System.out.print("Matematik Notunuz:");
        math = inp.nextInt();

        System.out.print("Müzik notunuz:");
        music = inp.nextInt();

        System.out.print("Fizik Notunuz:");
        science = inp.nextInt();

        System.out.print("Kimya Notunuz:");
        chemical = inp.nextInt();

        int sum = (math + science + chemical + turkish + history + music);
        float ort = sum / 6;

        System.out.println("Ortalamanız: " + ort);

        String result = ort > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(result);
    }
}
