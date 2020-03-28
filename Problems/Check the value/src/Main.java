import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = 0;
        try { input = scanner.nextInt(); }catch (Exception e) {e.printStackTrace(); }

        System.out.println((input>0) && (input<10));
    }
}