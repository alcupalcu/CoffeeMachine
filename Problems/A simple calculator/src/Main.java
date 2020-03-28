import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long firstNumber = 0L;
        long secondNumber = 0L;
        String operation = null;

        try {
            firstNumber = scanner.nextLong();
            operation = scanner.next();
            secondNumber = scanner.nextLong();
        }catch (Exception e){
            e.printStackTrace();
        }

        switch (operation){
            case "+":
                System.out.println(firstNumber+secondNumber);
                break;
            case "-":
                System.out.println(firstNumber-secondNumber);
                break;
            case "/":
                if(secondNumber == 0){
                    System.out.println("Division by 0!");
                    break;
                }
                System.out.println(firstNumber/secondNumber);
                break;
            case "*":
                System.out.println(firstNumber*secondNumber);
                break;
            default:
                System.out.println("Unknown operator");
        }
    }
}