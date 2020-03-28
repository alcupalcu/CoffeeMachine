import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstInteger = 0;
        int secondInteger = 0;
        int thirdInteger = 0;

        try { firstInteger = scanner.nextInt(); }catch (Exception e) { e.printStackTrace(); }
        try { secondInteger = scanner.nextInt(); }catch (Exception e) { e.printStackTrace(); }
        try { thirdInteger = scanner.nextInt(); }catch (Exception e) { e.printStackTrace(); }

        if(secondInteger > thirdInteger) {
            System.out.println(firstInteger >= thirdInteger && firstInteger <= secondInteger);
        }
        else if (thirdInteger > secondInteger) {
            System.out.println(firstInteger >= secondInteger && firstInteger <= thirdInteger);
        }
        else if (secondInteger == thirdInteger){
            System.out.println(firstInteger == secondInteger && firstInteger == thirdInteger);
        }
    }
}