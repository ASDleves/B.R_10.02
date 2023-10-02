package probaprojectokt;

public class Probaprojectokt {
    
    public static void main(String[] args) {
        jatek();
    }

    private static void jatek() {
        feltolt();
        kever();
        
    }
    private static void feltolt() {
        String toltpakli[] = {};
        String szinek[] = {"P","M","L","T"};
        String ertek[] = {"Ász","Kir","FEL","X","IX","VIII"};
        for (String szin : szinek) {
            for (String kartya : ertek) {
              System.out.println(szin+"_"+kartya);  
            }
            
        }
        
 
    }
    private static void kever() {
    }

    
    
        
        
}
