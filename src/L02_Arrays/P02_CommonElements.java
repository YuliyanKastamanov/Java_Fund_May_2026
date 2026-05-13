package L02_Arrays;

import java.util.Scanner;

public class P02_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Прочитаме входните данни
        String firstRow = scanner.nextLine(); // "Hey hello 2 4"
        String secondRow = scanner.nextLine(); // "10 hey 4 hello"

        String[] firstArray = firstRow.split(" "); //["Hey", "hello", "2", "4"]
        String[] secondArray =  secondRow.split(" ");//["10", "hey", "4", "hello"]

        //за всеки елемент от втория масив -> проверяваме дали го имаме в първия
        for (String element2 : secondArray){
            for (String element1 : firstArray){
                if(element2.equals(element1)){
                    System.out.print(element2 + " ");
                }
            }
        }


    }
}
