import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = 0;

        try{
            input = scanner.nextInt();
            boolean stopped = false;
            int counter = 0;
            for(int i = 1; i <= input && !stopped; i++) {
                for(int j = 1; j <= i; j++) {
                    System.out.print(i + " ");
                    counter++;
                    if(counter == input) {
                        stopped = true;
                        break;
                    }
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}