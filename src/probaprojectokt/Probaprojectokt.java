package probaprojectokt;

import java.util.Scanner;

public class Probaprojectokt {

   public static final int valasztas=melyik();
    public static void main(String[] args) {
        jatek();
    }

    private static void jatek() {
        kever();
        System.out.println(valasztas);
    }
    private static void feltolt() {
        String feltoltpakli[] = {};
        String szinek[] = {"P","M","L","T"};
        String ertek[] = {"Ász","Kir","FEL","X","IX","VIII"};
        for (String szin : szinek) {
            for (String kartya : ertek) {
              System.out.println(szin+"_"+kartya);
              feltoltpakli.
            }   
            
        }

        
 
    }
    private static void kever() {
    }
    private static int melyik(){
        boolean helyes = false;
        int szam = 0;
        while(helyes != true){
            Scanner sc = new Scanner(System.in);
            System.out.print("Melyik oszlop? (1-3): ");
            szam=sc.nextInt();
            if ((szam >0 )&& (szam < 4)) {
                helyes=true;
            }
        }
        return szam;
    }
    
    
        
        
}
