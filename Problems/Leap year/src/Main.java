import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;

        try { year = scanner.nextInt(); }catch (Exception e) {e.printStackTrace(); }
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap");
        }
        else {
            System.out.println("Regular");
        }
    }
}