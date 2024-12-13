package org.example;

import java.util.Locale;
import java.util.Scanner;

public class proje4 {
    public static void main(String[] args) {
        //vücut kitle indeksi hesaplama
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Boyunuzu giriniz: ");
            double boy = input.nextDouble();

            System.out.print("kilonuzu giriniz: ");
            double kilo = input.nextDouble();
            if (boy <= 0 || kilo <= 0) {
                System.out.println("Boy veya kilonuzu yanlış girdiniz.Lütfen tekrar deneyin.");
                return;
            }
            double indeks = kilo / (boy * boy);
            System.out.println("Vücut kitle indeksiniz: " + indeks);
            if (indeks < 18.5) {
                System.out.println("Zayif.");
            } else if (indeks < 24.9) {
                System.out.println("Normal veya sağlıklı kilo.");
            } else if (indeks < 29.9) {
                System.out.println("Aşırı kilo veya obezite öncesi");
            } else if (indeks < 34.9) {
                System.out.println("Sınıf 1 obezite");
            } else if (indeks < 39.9) {
                System.out.println("Sınıf 2 obezite");
            } else {
                System.out.println("Sınıf 3 obezite veya şiddetli obezite");
            }
        } catch (Exception ex) {
            System.out.println("Bir hata oluştu: " + ex.getMessage());
        }
    }
}
