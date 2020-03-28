import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nextNumber = 0;
        int currentMax = 0;


        try {
            do{
                nextNumber = scanner.nextInt();
                if(nextNumber > currentMax) {
                    currentMax = nextNumber;
                }
            } while (nextNumber != 0);
        } catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println(currentMax);
    }
}