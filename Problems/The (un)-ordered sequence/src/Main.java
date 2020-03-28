import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int currentInput = 0;
        int previousInput = 0;
        boolean isOrderedAscending = true;
        boolean isOrderedDescending = true;

        try {
            previousInput = scanner.nextInt();
            currentInput = scanner.nextInt();
            if(currentInput == 0) {
                System.out.println(true);
            } else {
                if(currentInput > previousInput) {
                    isOrderedDescending = false;
                } else if(currentInput < previousInput) {
                    isOrderedAscending = false;
                }
                previousInput = currentInput;
                while(true) {
                    currentInput = scanner.nextInt();
                    if(currentInput == 0) {
                        break;
                    }
                    else if(currentInput == previousInput) {
                        previousInput = currentInput;
                        continue;
                    }
                    else if(isOrderedAscending && currentInput < previousInput) {
                        isOrderedAscending = false;
                    }
                    else if(isOrderedDescending && currentInput > previousInput) {
                        isOrderedDescending = false;
                    }
                    previousInput = currentInput;
                }
                System.out.println(isOrderedAscending || isOrderedDescending);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}