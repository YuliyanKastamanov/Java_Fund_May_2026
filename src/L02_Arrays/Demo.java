package L02_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //String name = scanner.nextLine();

        //Създаване на целочислен Масив
        int[] numbers = new int[3];

        numbers[0] = 10;
        numbers[1] = 15;
        numbers[2] = 20;

        //имаме несъществуващ индекс
        //numbers[3] = 30;

        //Прочитане на масив от конзолата
        String input = scanner.nextLine();

        String[] names = input.split(",");

        //foreach цикъл
        for (String name : names){
            System.out.println(name);
        }

        for (int nameIndex = 0; nameIndex < names.length; nameIndex++) {

            System.out.println(names[nameIndex]);
            
        }

        //String.join()
        System.out.println(String.join(", ", names));
        System.out.println(String.join(", ", Arrays.toString(numbers)));

        int age = Integer.parseInt(scanner.nextLine());

        //Прочитаме на целочислен масив от конзолата
        int[] ages = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        //Прочитаме на масив с дробни числа от конзолата
        double[] salaries = Arrays.stream(scanner.nextLine().split(", "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        //System.out.println(name);

        String command = scanner.nextLine();

        while (!command.equals("end")){



            command =  scanner.nextLine();
        }

    }
}
