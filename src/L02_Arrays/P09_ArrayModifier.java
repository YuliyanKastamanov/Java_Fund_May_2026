package L02_Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class P09_ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Прочитаме масива от конзолата
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();// [23, -2, 321, 87, 42, 90, -123]

        //2. Прочитаме командите, които трябва да изпълним
        String input = scanner.nextLine();

        while (!input.equals("end")){
            //!input.equals("end") -> валидна команда

            String currentCommand = input.split(" ")[0];
            //Switch-ваме по командата -> swap, multiply, decrease
            switch (currentCommand){

                //стар switch
                /*case "swap":
                    //действие, което искаме да се изпълни
                    break;*/

                //нов switch
                //swap
                case "swap" -> {
                    //input = "swap 1 3".split(" ") -> ["swap", "1", "3"]
                    int firstIndex = Integer.parseInt(input.split(" ")[1]);
                    int secondIndex = Integer.parseInt(input.split(" ")[2]);

                    //вземаме числата от масива, които ще завъртим
                    int firstNumber = numbers[firstIndex];
                    int secondNumber = numbers[secondIndex];

                    //размяната
                    numbers[firstIndex] = secondNumber;
                    numbers[secondIndex] = firstNumber;
                }

                //multiply
                case "multiply" -> {
                    //input = "multiply 3 5".split(" ") -> ["multiply", "3", "5"]
                    int firstIndex = Integer.parseInt(input.split(" ")[1]);
                    int secondIndex = Integer.parseInt(input.split(" ")[2]);

                    //вземаме числата от масива, които ще умножим
                    int firstNumber = numbers[firstIndex];
                    int secondNumber = numbers[secondIndex];

                    //Пресмятаме резултата от умножението
                    int result = firstNumber * secondNumber;

                    //Променяме елемента, който имаме на първия индекс
                    numbers[firstIndex] = result;
                }

                //decrease -> намаляме всеки от елементите с 1
                case "decrease" -> {
                    //обхождаме елементите
                    for (int index = 0; index < numbers.length; index++) {
                        numbers[index]--;

                    }
                }


            }
            input = scanner.nextLine();
        }

        for (int index = 0; index < numbers.length; index++) {
            int numberToPrint = numbers[index];

            if(index != numbers.length - 1){
                //при различен от последния индекс принтираме ","
                System.out.print(numberToPrint + ", ");
            }else {
                System.out.print(numberToPrint);
            }

        }





    }
}
