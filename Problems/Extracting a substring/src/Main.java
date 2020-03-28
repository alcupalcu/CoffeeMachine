import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = null;
        int substringFirstChar = -1;
        int substringSecondChar = -1;
        int inputLength = 0;

        try {input = scanner.next(); inputLength = input.length();}catch (Exception e){e.printStackTrace();}
        try{substringFirstChar = scanner.nextInt();}catch (Exception e){e.printStackTrace();}
        try{substringSecondChar = scanner.nextInt();}catch (Exception e){e.printStackTrace();}

        if((substringFirstChar>=0 && substringFirstChar<inputLength)
                && (substringSecondChar>=0 && substringSecondChar<inputLength)
                && (substringFirstChar<=substringSecondChar)) {
            System.out.println(input.substring(substringFirstChar,substringSecondChar+1));
        }
    }
}