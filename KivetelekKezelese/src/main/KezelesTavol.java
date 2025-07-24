package main;

public class KezelesTavol {
    public static void main(String[] args) {
        boolean siker = false;
        try {
            /* atalakitas(double, int) miatt: */
            if(Double.isFinite(osztas(2, atalakitas("10")))){
                siker = true;
            }//esetleg NaN is jöhet, vagy Infinity
        } catch (NumberFormatException e) {
            System.out.println("hiba: átalakítás.");
        } catch (ArithmeticException e) {
            System.out.println("hiba: osztás.");
        } finally{
            if(siker) {
                System.out.println("Sikeres volt a művelet");
            } else {
                System.out.println("NEM volt sikeres a művelet");
            }
        }
    }

    private static int atalakitas(String str) throws NumberFormatException{
        return Integer.parseInt(str);
    }

    /* ha osztas(double a, double b)
     * akkor Infinity-t ad, nem kivételt
    */
    private static double osztas(int a, int b) throws ArithmeticException{
        return a / b;
    }
}
