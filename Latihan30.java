
package Pertemuan5;

import java.util.Scanner;

public class Latihan30 {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String CYAN = "\u001B[36m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(RED + "Kamu " + GREEN +"ngerjain sendiri " + YELLOW + "latihan 17 sampe" + BLUE + " latihan 30 ini?" + RESET + "\n" + BLUE +
                "Jawab " + RED + "(Yoi/Enggak) : " + RESET);
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("Yoi")) {
            System.out.println(RED + "Cakep Bener. " + PURPLE + "Good Job" + RESET);
        } else {
            System.out.println(RED + "Tetep cakep sih." + RESET);
            System.out.println(CYAN + "Sing penting paham konsep nya yee." + RESET);
            System.out.println("Keep the code works dude");
        }

        scanner.close();
    }
}


