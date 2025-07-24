package main;

class Konyv{
    private String cim;
    private int kiadasEve;
    private int ar;
    
    public Konyv(String cim, int kiadasEve, int ar) throws IllegalArgumentException{        
        if(cim.length() < 3){
            throw new IllegalArgumentException("rövid cím.");
        }
        
        if(kiadasEve < 1000){
            throw new IllegalArgumentException("nem létező év.");
        }

        this.cim = cim;
        this.kiadasEve = kiadasEve;
        //this.ar = ar;
        setAr(ar);
    }
    
    public void setAr(int ar) throws IllegalArgumentException{
        if(ar < 1){
            throw new IllegalArgumentException("nem létező ár.");
        }
        this.ar = ar;
    }
}

public class KivetelDobasa {
    public static void main(String[] args) {
        /* A konstruktor és a setter dobhat kivételt: */
        try {
            Konyv konyv = new Konyv("aaa", 1999, 10);
            System.out.println("A könyv objektum létrejött!");
            konyv.setAr(0);
            System.out.println("Sikeres ár módosítás!");
        } catch (IllegalArgumentException e) {
            System.err.println("A könyv objektum nem jött létre.");
            System.err.println("oka: " + e.getMessage());
        }

    }
}
