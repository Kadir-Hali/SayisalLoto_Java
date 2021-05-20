/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ara_sınav;

/**
 *
 * @author kadir
 */
public class Vize_Soru_1 {
    static int Kare_Top(int deger){
    int sonuc=0;
       if(deger==1)
      {
         return sonuc=1 ;
      }           
       else if (deger<=0){
    System.out.println("Girdiğiniz değer negatiftir.Lütfen pozitif bir değer giriniz!");
          System.exit(0);
       }
       else{
           sonuc =(deger*deger)+Kare_Top(deger-1);
               }      
       return sonuc ;
    }      
  public static void main(String[] args) {
      int yaz=Kare_Top(3);
        System.out.println("Oluşan sayı:" + yaz);
    }
    }
