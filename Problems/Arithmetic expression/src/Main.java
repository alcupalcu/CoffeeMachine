import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        process(n);
    }

    public static void process(int n) {
        System.out.println(((n + 1) * n + 2) * n + 3);
    }
}