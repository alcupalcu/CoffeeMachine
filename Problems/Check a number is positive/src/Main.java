import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = 0;
        try { input = scanner.nextInt(); }catch (Exception e) {e.printStackTrace(); }

        if(input > 0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}