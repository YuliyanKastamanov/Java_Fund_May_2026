package L01_Data_Types_And_Variables;

import java.util.Scanner;

public class P06_TriplesOfLatinLetters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //броя букви от азбуката, които трябва да въртя
        int n = Integer.parseInt(scanner.nextLine());

        for (char letter1 = 'a'; letter1 < 'a' + n ; letter1++) { //първата буква в тройката
            for (char letter2 = 'a'; letter2 < 'a' + n ; letter2++) {//втората буква в тройката
                for (char letter3 = 'a'; letter3 < 'a' + n; letter3++){//третата буква в тройката

                    //тройката: "{letter1}{letter2}{letter3}"
                    System.out.printf("%c%c%c%n", letter1, letter2, letter3);

                    //System.out.println("" + letter1 + letter2 + letter3);

                }

            }

        }


    }
}
