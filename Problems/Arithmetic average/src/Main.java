import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = 0;
        int secondNumber = 0;

        try {
            firstNumber = scanner.nextInt();
            secondNumber = scanner.nextInt();
        } catch(Exception e) {
            e.printStackTrace();
        }

        double sumOfNumbers = 0;
        int numbersCounter = 0;

        for(int i = firstNumber; i <= secondNumber; i++) {
            if(i % 3 == 0) {
                sumOfNumbers += i;
                numbersCounter++;
            }
        }

        double result = sumOfNumbers/numbersCounter;

        System.out.println(sumOfNumbers/numbersCounter);
    }
}