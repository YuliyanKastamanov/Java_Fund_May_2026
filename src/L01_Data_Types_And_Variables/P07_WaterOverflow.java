package L01_Data_Types_And_Variables;

import java.util.Scanner;

public class P07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        short maxLiters = 255;// максимално количество литри, които можем да запълним
        int currentLiters = 0;// текущото количество литри във резервоара
        int count = Integer.parseInt(scanner.nextLine());// колко пъти ще наливаме вода

        for (int i = 1; i <= count ; i++) {
            int litersToFill = Integer.parseInt(scanner.nextLine());// литрите, които ще наливаме

            //наливане
            currentLiters += litersToFill;

            //проверяваме дали сме препълнили резервоара
            if (currentLiters > maxLiters){
                //резервоара прелива
                System.out.println("Insufficient capacity!");
                //премахваме количеството вода, което сме наляли по-рано
                currentLiters -= litersToFill;

            }

        }

        System.out.println(currentLiters);


    }
}
