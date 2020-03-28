import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = null;
        String input2 = null;

        try {input1 = scanner.nextLine();}catch (Exception e) {e.printStackTrace();}
        try {input2 = scanner.nextLine();}catch (Exception e) {e.printStackTrace();}

        if(!input1.isEmpty() && !input2.isEmpty()) {
            System.out.println((input1.replace(" ","")).equals(input2.replace(" ","")));
        }
    }
}