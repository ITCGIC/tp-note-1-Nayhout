package tp_note_1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Program for converting time to seconds.");

        Scanner input_riels = new Scanner(System.in);
        Scanner input_rates = new Scanner(System.in);

        float riels = -1;
        float rates = -1;

        while (riels < 0) {
            System.out.print("Please input money in Riels: ");
            String input = input_riels.nextLine();
            try {
                riels = Integer.valueOf(input);
            } catch (NumberFormatException e) {
                riels = -1;
            }
        }

        while (rates < 0) {
            System.out.print("Please input exchange rates: ");
            String input = input_rates.nextLine();
            try {
                rates = Float.valueOf(input);
            } catch (NumberFormatException e) {
                rates = -1;
            }
        }

        float dollars = riels / rates ;
        System.out.println("");
        System.out.println("Conversion rate is: 1 USD = "+rates+" RIELS");
        String output = riels+" RIELS ="+dollars+" USD" ;
        int count = output.length();
        for (int i=0; i<= count; i++){
            System.out.print("-");
        }
        System.out.println("");
        System.out.print(output);
    }
}
