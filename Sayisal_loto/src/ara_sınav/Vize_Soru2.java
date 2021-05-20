/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ara_sınav;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kadir
 */
public class Vize_Soru2 {
      public static void main(String[] args) {
      Scanner giris = new Scanner(System.in);
      System.out.print("Kolon sayısı giriniz(1-8):");
        int kolon_sayisi =giris.nextInt();
        if(kolon_sayisi<1 || kolon_sayisi>8){
               System.out.println("Hatalı kolon sayısı seçtiniz.Lütfen 1 ile 8 arasında kolon sayısı seçiniz.");
               System.exit(0);
        }
        Random rnd = new Random();
        int gecici_dizi[] = new int [6*kolon_sayisi];        
        int dizi[]=new int [6];
        int eksay;
        boolean kontrol2,kontrol1;
        for (int i = 0; i < kolon_sayisi; i++) {
            System.out.println((i+1)+".Kolon Sayıları: ");
            for (int j = 0; j < dizi.length; j++) {
                do { 
                   kontrol1 = false;
                    eksay = rnd.nextInt(49)+1;
                for (int k = 0; k < j; k++) {
                        if (dizi[k] == eksay) {
                          kontrol1 = true;
                          break;
                        }
                        }
               } while (kontrol1);
                 do {
                     int gecici_sayi = rnd.nextInt(49)+1;
                    kontrol2 = false;
                       for (int l = 0; l <gecici_dizi.length ; l++) {
                           if (gecici_dizi[l] == eksay) {
                               kontrol2 = true;
                               eksay = gecici_sayi;
                               break;
                        }
                        }
                        } 
                 while (kontrol2);
                   dizi[j] = eksay;
                   if (i == 0)
                    gecici_dizi[j] = dizi[j];
                   else
                    gecici_dizi[i*6+j] = dizi[j];
                    }
               for (int k = 0; k < dizi.length; k++) { 
               Arrays.sort(dizi); 
               System.out.print(dizi[k]);
                  if(k<dizi.length-1) 
               System.out.print("-");  
                }   
        System.out.println("");
        System.out.println("__________________");
        }
        }
        }
    

