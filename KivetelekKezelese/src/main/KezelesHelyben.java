package main;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class KezelesHelyben {

    public static void main(String[] args) {
        /* System.err ékezeteinek beállítása: */
        //System.setErr(new PrintStream(System.err, true, StandardCharsets.UTF_8));
        
        System.out.println("Kivételek kezelése a keletkezés helyén:");

        //egyKivetelElkapasa();
        tobbKivetelElkapasa();

        System.out.println("program vége");
    }

    private static void tobbKivetelElkapasa() {
        String str = "a";
        try{
            int szam = Integer.parseInt(str);
            double e = 2/szam;
            System.out.println("eredmény: " + e);
        }catch(ArithmeticException e){
            System.err.print("Nem sikerült az osztás: ");
            System.err.print(e.getMessage() + "\n");
        }catch(NumberFormatException e){
            System.err.print("Hibás számformátum: ");
            System.err.print(e.getMessage() + "\n");
        }catch(Exception e){
            System.err.println("Nem várt kivétel: ");
            System.err.println(e.getMessage());
            System.err.print("A kivétel osztálya: ");
            System.err.println(e.getClass().getSimpleName());
        }
    }
    
    private static void egyKivetelElkapasa() {
        int a = 2, b = 0;//b értékét pl bekérjük
        try {
            double eredmeny = a / b;
        } catch (ArithmeticException e) {
            System.err.println("Nem sikerült az osztás!");
            System.err.println("hiba oka: " + e.getMessage());
            System.err.println("Az eredeti kivétel: ");
            e.printStackTrace();
        } finally{
            /* nem kötelező, de ide mindenképpen eljut a program
            * tipikusan itt végzik az erőforrás felszabadítást:
            lezáró/bezáró/takarító műveleteket
            */
            System.out.println("osztás vége");
        }
    }

    
}
