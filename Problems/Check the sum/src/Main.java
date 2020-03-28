import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0;

        try { a = scanner.nextInt(); }catch (Exception e) {e.printStackTrace(); }
        try { b = scanner.nextInt(); }catch (Exception e) {e.printStackTrace(); }
        try { c = scanner.nextInt(); }catch (Exception e) {e.printStackTrace(); }

        System.out.println(a+b == 20 || b+c == 20 || a+c == 20);
    }
}