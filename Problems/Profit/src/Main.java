import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = 0;
        double percentPerYear = 0;
        double moneyToMake = 0;

        try {
            money = scanner.nextInt();
            percentPerYear = scanner.nextInt();
            moneyToMake = scanner.nextInt();
        } catch(Exception e) {
            e.printStackTrace();
        }

        int yearsToReachAmountWished = 0;

        while (money < moneyToMake) {
            money *= (percentPerYear/100) + 1;
            yearsToReachAmountWished++;
        }

        System.out.println(yearsToReachAmountWished);
    }
}