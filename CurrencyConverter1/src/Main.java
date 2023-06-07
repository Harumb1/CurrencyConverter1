import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //1 BGN = 2.54 Romanian Leu
        // 1 BGN = 11.63 Turkish Lira
        // 1 BGN = 0.51 Euro
        // 1 BGN = 0.55 USD

        Scanner sc = new Scanner(System.in);
        System.out.println("BGN (Bulgarian Lev) to Other!");
        System.out.println("What currency would you like to convert to? " +
                "\n 1. Romanian Leu." +
                "\n 2. Turkish Lira." +
                "\n 3. Euro." +
                "\n 4. USD.");
        int currency = Integer.valueOf(sc.nextLine());

        System.out.println("How much would you like to convert?");
        double amount = Integer.valueOf(sc.nextLine());

        //amount refers to BGN (Bulgarian Lev)
        switch (currency){
            case 1: {
                Converter.BTR(amount);
                System.out.println("Romanian Leu");
            }
            break;
            case 2: {
                Converter.BTT(amount);
                System.out.println("Turkish Lira");
            }
            break;
            case 3: {
                Converter.BTE(amount);
                System.out.println("Euro");
            }
            break;
            case 4: {
                Converter.BTU(amount);
                System.out.println("USD");
            }
            break;
            default:
                System.out.println("Invalid option!");
        }

    }

}