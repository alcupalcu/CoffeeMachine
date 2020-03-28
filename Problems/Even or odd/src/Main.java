import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nextInput = 0;
        String resultString = "";

        try {
            while(true) {
                nextInput = scanner.nextInt();
                if(nextInput == 0) {
                    break;
                }
                if(nextInput % 2 == 0) {
                    resultString += "even\n";
                } else {
                    resultString += "odd\n";
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println(resultString);
    }
}