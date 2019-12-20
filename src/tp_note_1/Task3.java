package tp_note_1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Program for converting time to seconds.");

        Scanner input_hours = new Scanner(System.in);
        Scanner input_minutes = new Scanner(System.in);
        Scanner input_seconds = new Scanner(System.in);
        int seconds=-1;
        int minutes=-1 ;
        int hours=-1;

        while (hours < 0) {
            System.out.print("Input number of hours:");
            String input = input_hours.nextLine();
            try {
                hours = Integer.valueOf(input);
            } catch (NumberFormatException e) {
                hours = -1;
            }
        }

        while (minutes < 0) {
            System.out.print("Input number of minutes:");
            String input = input_minutes.nextLine();
            try {
                minutes = Integer.valueOf(input);
            } catch (NumberFormatException e) {
                minutes = -1;
            }
        }

        while (seconds < 0) {
            System.out.print("Input number of second:");
            String input = input_seconds.nextLine();
            try {
                seconds = Integer.valueOf(input);
            } catch (NumberFormatException e) {
                seconds = -1;
            }
        }


        int total_seconds = (hours * 3600) + (minutes * 60) + seconds ;
        System.out.println("");
        String output = "Number of seconds = "+hours+"x3600 + "+minutes+"x60 + "+seconds+" = "+total_seconds ;
        int count = output.length();
        for (int i=0; i<= count; i++){
            System.out.print("-");
        }
        System.out.println("");
        System.out.print(output);
    }

}
