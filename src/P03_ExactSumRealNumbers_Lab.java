import java.math.BigDecimal;
import java.util.Scanner;

public class P03_ExactSumRealNumbers_Lab {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        BigDecimal sum = new BigDecimal(0);

        /* BigDecimal numberToAdd = new BigDecimal("10");*/
        /*sum.add(numberToAdd);// събиране
        sum.subtract(numberToAdd);// изваждане
        sum.multiply(numberToAdd);//умножение
        sum.divide(numberToAdd);//деление
        sum.divideAndRemainder()// деление с остатък*/

        for (int i = 1; i <= n ; i++) {

            BigDecimal currentNumber = new BigDecimal(scanner.nextLine());

            sum = sum.add(currentNumber);

        }

        System.out.println(sum);
    }
}
