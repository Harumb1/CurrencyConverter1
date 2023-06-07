public class Converter {

    //amount refers to BGN (Bulgarian Lev)
    public static void BTR(double amount){
        //bgn to romanian leu
        System.out.println(amount + " * 2.54 = " + amount*2.54 + " Romanian Leu");
    }
    public static void BTT(double amount){
        //bgn to turkish lira
        System.out.println(amount + " * 11.63 = " + amount*11.63 + " Turkish Lira");
    }
    public static void BTE(double amount){
        //bgn to euro
        System.out.println(amount + " * 0.51 = " + amount*0.51 + " Euro");
    }
    public static void BTU(double amount){
        //bgn to usd
        System.out.println(amount + " * 0.55 = " + amount*0.55 + " USD");
    }
}