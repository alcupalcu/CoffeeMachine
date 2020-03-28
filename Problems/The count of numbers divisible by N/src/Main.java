import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = 0;
        int endNumber = 0;
        int divisionNumber = 0;

        try {
            startNumber = scanner.nextInt();
            endNumber = scanner.nextInt();
            divisionNumber = scanner.nextInt();
        } catch(Exception e) {
            e.printStackTrace();
        }

        int counterOfDivisible = 0;

        for(int i = startNumber; i <= endNumber; i++) {
            if(i % divisionNumber == 0) {
                counterOfDivisible++;
            }
        }

        System.out.println(counterOfDivisible);
    }
}