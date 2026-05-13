package L02_Arrays;

import java.util.Scanner;

public class P01_Train {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int wagonCounts = Integer.parseInt(scanner.nextLine());
        int[] wagons = new int[wagonCounts];

        for (int wagon = 0; wagon < wagonCounts ; wagon++) {

            int countPeople = Integer.parseInt(scanner.nextLine());

            wagons[wagon] = countPeople;

        }

        int sum = 0;
        for (int people : wagons){
            System.out.print(people + " ");

            sum += people;
        }
        System.out.println();
        System.out.println(sum);

    }
}
