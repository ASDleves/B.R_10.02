package probaprojectokt;

import java.util.Scanner;

public class Probaprojectokt {
   public static final String Pakli[]= feltolt();
   public static final int valasztas=melyik();
    public static void main(String[] args) {
        jatek();
    }

    private static void jatek() {
        kever();
        System.out.println(valasztas);
        System.out.println(Pakli[19]);
    }

    private static String[] feltolt() {
        String feltoltpakli[]= new String[21];
        String szinek[] = {"P","M","L","T"};
        String ertek[] = {"Ász","Kir","FEL","X","IX","VIII"};
        int i = 0;
        while (i >20)
        for (String szin : szinek) {
            for (String kartya : ertek) {
                feltoltpakli[i]=szin+"_"+kartya;
                i++;
            }   
            
        }
       return feltoltpakli;
        
        
 
    }
    private static void kever() {
        String elso[]={};
        String masodik[]={};
        String harmadik[]={};
        
        switch (valasztas) {
            case 1:
                
                break;
            case 2:
                break;
            case 3:
                break;
        }
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
