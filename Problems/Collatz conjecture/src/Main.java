import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = 0;

        try {
            input = scanner.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.print(input + " ");

        while (input != 1) {
            if (input % 2 == 0) {
                input /= 2;
            } else {
                input *= 3;
                input++;
            }
            System.out.print(input + " ");
        }
    }
}