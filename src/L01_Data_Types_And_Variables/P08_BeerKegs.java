package L01_Data_Types_And_Variables;

import java.util.Scanner;

public class P08_BeerKegs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countKegs = Integer.parseInt(scanner.nextLine());

        // за всеки кег ще прочитаме 3 реда
        //1. модел -> String
        //2. радиус -> double
        //3. височина -> int
        //4. за всеки кег трябва да пресметнем обем-а -> пи * радиус * радиус * височината

        double maxVolume = 0;// максималния обем -> започваме от най-ниската стойност за double
        String modelWithMaxVolume = ""; // модела с най-голям обем

        for (int i = 1; i <= countKegs ; i++) {

            //въвеждаме данните за кега
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            //изчисляваме обема -> пи * радиус * радиус * височината
            double volume = Math.PI * Math.pow(radius, 2) * height;


            //проверяваме дали обема на кег-а е по-голям от предишните получени
            if(volume > maxVolume){
                //Моя кег е най-голям
                maxVolume = volume;
                modelWithMaxVolume =  model;
            }

        }

        System.out.println(modelWithMaxVolume);

    }
}
