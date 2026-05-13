package L02_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P03_ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int countRows = Integer.parseInt(scanner.nextLine());// броя редове, които ще се въвеждат

        int[] firstArray = new int[countRows];
        int[] secondArray = new int[countRows];

        for (int row = 1; row <= countRows ; row++) {
            String input = scanner.nextLine(); //"1 5".split(" ") -> ["1", "5"]

            int firstNumber = Integer.parseInt(input.split(" ")[0]);
            int secondNumber = Integer.parseInt(input.split(" ")[1]);

            if(row % 2 == 1){//1, 3, 5, 7, нечетен ред
                //нечетен ред: първото число отива в първия масив; второто число отива във втория масив
                firstArray[row - 1] = firstNumber;
                secondArray[row - 1] = secondNumber;
            }else {
                //четен ред: първото число отива в втория масив; второто число отива във първия масив
                secondArray[row - 1] = firstNumber;
                firstArray[row - 1] = secondNumber;
            }
        }

        //принтираме първия масив
        for (int number : firstArray){
            System.out.print(number + " ");
        }

        System.out.println();

        //принтираме втория масив
        for (int number : secondArray){
            System.out.print(number + " ");
        }
    }
}
