package L01_Data_Types_And_Variables;

import java.util.Scanner;

public class P02_SumDigits {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        // While цикъл  -> защото не знаем колко пъти ще повтаряме действието
        // стоп: числото <= 0
        // продължаваме: числото > 0
        //1. вземаме последна цифра
        //2. добавяме я към общата сума
        //3. премахваме последната цифра

        while (number > 0){
            //1. вземаме последна цифра
            int lastDigit = number % 10;

            //2. добавяме я към общата сума
            sum += lastDigit;

            //3. премахваме последната цифра
            number = number / 10;
        }

        //нямаме повече цифри
        System.out.println(sum);

    }

}
