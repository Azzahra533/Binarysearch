/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dictionary;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 26218
 */
public class Binarysearch {
public static int binarySearch(String[] a, String x) {
        int z = 0;
        int head = a.length - 1;
        int y;

        while (z <= head) {
            y = (z + head) / 2;

            if (a[y].compareTo(x) < 0) {
                z = y + 1;
                } else if (a[y].compareTo(x) > 0) {
                    head = y - 1;
                } else {
                    return y;
                }
        }
        return -1;
    }
    
     public static int process(String[] dataUnsp, String cari){    
        
        for(int c = 0 ; c < dataUnsp.length;c++ )
        {
            if(cari.equals(dataUnsp[c]))
            {
                int dataOut = c;
                return dataOut;
            }       
        }    
        return 0;
    }       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String ID[] ={"Meja","Kursi","Buku","Lemari","Boneka","Kacamata","Sepatu","Kemeja","Jeruk","Jambu",
                      "Makan","Minum","Duduk","Berdiri","Bernyanyi","Lagu","Menari","Jalan","Lari","Lompat",
                      "Pisang","Semangka","Pohon","Surat","Daun","Kayu","Bambu","Bunga","Gambar","Kucing"};
        String cacheID[] = ID.clone();
        String ENG[] ={"Table","Chair","Book","Cupboard","Doll","Glasses","Shoes","Shirt","Orange","Guava",
                       "Eat","Drink","Sit","Stand","Sing","Song","Dance","Walk","Run","Jump",
                       "Banana","Watermelon","Tree","Mail","Leaf","Wood","Bamboo","Flower","Picture","Cat"};
        String cacheENG[] = ENG.clone();  
        
       
        
        // Cari Kosakata ID/ENG
       
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println(">>> Cari Kosakata <<<");
        String search = keyboard.nextLine();
          System.out.println("\nTerjemahkan : " + search);

        int idOutput = process(cacheID,search);
        int enOutput = process(cacheENG,search);
   
        Arrays.sort(ID);
        Arrays.sort(ENG);
        int idResult = binarySearch(ID,search);
        int enResult = binarySearch(ENG,search);   
       
        if(idResult == -1 && enResult == -1)
        {
             System.out.println("\n||==============================================||");
            System.out.println("||\t     Terjemahan Tidak Ditemukan\t\t||");
             System.out.println("||==============================================||");
        }
         else
            {   for(int y = 0; y <= ID.length; y++)
                {           
                    if(search.equals(ID[y]))
                    {
                      System.out.println("\n||==============================================================||");
                      System.out.println("||                           TERJEMAHAN                         ||");
                      System.out.println("||==============================================================||");
                      System.out.println("||            Indonesia           ||           Inggris          ||");
                      System.out.println("||--------------------------------||----------------------------||");
                      System.out.println("||            " +search + "             ||" + "           " + cacheENG[idOutput] + "           ||");
                      System.out.println("||==============================================================||");
                      break;
                    }
                    else if (search.equals(ENG[y]))
                    {
                        System.out.println("\n||===============================================================||");
                        System.out.println("||                          TERJEMAHAN                           ||");
                        System.out.println("||===============================================================||");
                        System.out.println("||            Inggris           ||            Indonesia          ||");
                        System.out.println("||------------------------------||-------------------------------||");
                        System.out.println("||            "+ search + "            ||" + "           " + cacheID[enOutput] + "           ||");
                        System.out.println("||===============================================================||");
                        break;
                                            }
                    else {
                      
                        
                }
            }
        }
    }
}
