package L02_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P04_ArrayRotation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()//"51 47 32 61 21"
                .split(" ")) // ["51", "47", "32", "61", "21"]
                .mapToInt(Integer::parseInt)// [51, 47, 32, 61, 21]
                .toArray();

        int rotations = Integer.parseInt(scanner.nextLine());

        for (int rotation = 1; rotation <= rotations ; rotation++) {
            //ротация в масива
            //1. вземаме 1 елемент
            int firstElement = numbers[0];

            //2. преместваме елементите с един индекс на ляво
            //!!! не променяме нищо от последната позиция
            for (int position = 0; position < numbers.length - 1; position++) {
                numbers[position] = numbers[position + 1];
                
            }

            //[47, 32, 61, 21, 21]
            //3. поставяме първия елемент на последния индекс
            numbers[numbers.length - 1] = firstElement;//[47, 32, 61, 21, 51]

        }

        for (int number: numbers){
            System.out.print(number + " ");
        }
        //Arrays.stream(numbers).forEach(number -> System.out.print(number + " ") );

    }
}
