package tp_note_1;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Program for converting seconds into formated H:M:S");

        Scanner input_seconds = new Scanner(System.in);
        int seconds = -1;
        int minutes;
        int hours;

        while (seconds < 0) {
            System.out.print("Input number of seconds:");
            String input = input_seconds.nextLine();

            try {
                seconds = Integer.valueOf(input);
            } catch (NumberFormatException e) {
                seconds = -1;
            }
        }
        hours = seconds / 3600;
        minutes = (seconds % 3600) / 60;
        int seconds_output = (seconds % 3600) % 60;


        System.out.printf("Time corresponding to " + seconds + " seconds is ");
        System.out.println(hours + ":" + minutes + ":" + seconds_output);

    }
}
