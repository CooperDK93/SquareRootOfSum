import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First Number");
        int userFirst = scanner.nextInt();
        System.out.println("Second Number");
        int userSecond = scanner.nextInt();

        int userSum = userFirst + userSecond;
        double squareRoot = Math.sqrt(userSum);

        System.out.println(squareRoot);

    }
}
