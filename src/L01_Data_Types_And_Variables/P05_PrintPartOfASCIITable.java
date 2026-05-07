package L01_Data_Types_And_Variables;

import java.util.Scanner;

public class P05_PrintPartOfASCIITable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startingAsciiCode = Integer.parseInt(scanner.nextLine());
        int endAsciiCode = Integer.parseInt(scanner.nextLine());

        for (int code = startingAsciiCode; code <= endAsciiCode ; code++) {

            char currentChar = (char) code;

            System.out.print( currentChar + " ");

        }

    }
}
