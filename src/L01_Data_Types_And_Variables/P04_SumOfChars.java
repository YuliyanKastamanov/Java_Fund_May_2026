package L01_Data_Types_And_Variables;

import java.util.Scanner;

public class P04_SumOfChars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countSymbols = Integer.parseInt(scanner.nextLine());
        int sum = 0;// сумата от всички аски кодове

        for (int i = 1; i <= countSymbols; i++) {

            char symbol = scanner.nextLine().charAt(0);// вземаме въведия символ от конзолата

            int code = (int) symbol;// получаваме аски код-а на въведения символ

            sum += code;

        }

        System.out.println("The sum equals: " + sum);

    }

}
