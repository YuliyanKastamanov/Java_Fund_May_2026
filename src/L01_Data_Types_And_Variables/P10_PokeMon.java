package L01_Data_Types_And_Variables;

import java.util.Scanner;

public class P10_PokeMon {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());// текуща сила
        int distance = Integer.parseInt(scanner.nextLine());// разстояние за изминаване
        int exhaustionFactor =  Integer.parseInt(scanner.nextLine());// коефициент на изстощение

        int startPower = power; //първоначална стойност
        int countPoke =  0;// брой сръчквания

        while (power >= distance){
            //1. изминаваме разстоянието до целта -> power -= distance
            power -= distance;
            //2. сръчкали сме покемон
            countPoke++;
            //3. проверяваме да умората -> текущата сила == първоналната сила / 2
            if(power == startPower / 2 && exhaustionFactor != 0){

                //делим текущата сила / коефициент на изстощение -> power / exhaustionFactor
                power = power / exhaustionFactor; // power /= exhaustionFactor

            }
        }

        System.out.println(power);
        System.out.println(countPoke);


    }
}
