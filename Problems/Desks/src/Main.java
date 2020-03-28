import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudentsInGroup = 0;
        int desks = 0;

        for(int i = 0; i < 3; i++) {
            numberOfStudentsInGroup = scanner.nextInt();
            desks += numberOfStudentsInGroup / 2;
            if(numberOfStudentsInGroup % 2 != 0) {
                desks += 1;
            }
        }
        System.out.println(desks);
    }
}