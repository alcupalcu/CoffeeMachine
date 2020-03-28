import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;

        try { input = scanner.nextInt(); }catch (Exception e) {e.printStackTrace(); }

        int digit1 = 0;
        int digit2 = 0;
        int digit3 = 0;
        int digit4 = 0;

        if(input >= 1000) {
            digit4 = input % 10;
            digit3 = ((input % 100) - digit4) / 10;
            digit2 = ((input % 1000) - (digit3 * 10) - digit4) / 100;
            digit1 = input / 1000;
        } else if(input >= 100) {
            digit4 = input % 10;
            digit3 = ((input % 100) - digit3) / 10;
            digit2 = input / 100;
        } else if(input >= 10) {
            digit4 = input % 10;
            digit3 = input / 10;
        } else {
            digit4 = input;
        }
        if(digit1 == digit4 && digit2 == digit3) {
            System.out.println(1);
        }
        else {
            System.out.println(37);
        }
    }
}