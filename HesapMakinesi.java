package myOwnWork;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

            Scanner al = new Scanner(System.in);
            System.out.print("1. sayıyı giriniz: ");
            double num1 = al.nextDouble();
            System.out.print("2. sayıyı giriniz");
            double num2 = al.nextDouble();
            System.out.print("operator giriniz(/,*,-,+,%) : ");
            char operator = al.next().charAt(0);
            switch (operator) {
                case '+':
                    System.out.println(num1 + num2);
                    break;
                case '-':
                    System.out.println(num1 - num2);
                    break;
                case '*':
                    System.out.println(num1 * num2);
                    break;
                case '/':
                    System.out.println(num1 / num2);
                    break;
                case '%':
                    System.out.println((num1 * num2) / 100);
                default:
                    System.out.println("hatalı operator girdiniz: ");
            }



    }
}
