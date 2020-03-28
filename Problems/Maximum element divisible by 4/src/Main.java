import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfElementsInSequence = 0;

        try {
            numberOfElementsInSequence = scanner.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
        }

        int nextElement = 0;
        int actualMaxDivisibleByFour = 0;

        for (int i = 0; i < numberOfElementsInSequence; i++) {
            try {
                nextElement = scanner.nextInt();
                if(nextElement % 4 == 0 && nextElement > actualMaxDivisibleByFour) {
                    actualMaxDivisibleByFour = nextElement;
                }
            } catch(Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println(actualMaxDivisibleByFour);
    }
}