import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String result = "";

        for(int i = 0; i < 4; i++) {
            int input = scanner.nextInt();
            result += --input + " ";
        }

        System.out.println(result);
    }
}