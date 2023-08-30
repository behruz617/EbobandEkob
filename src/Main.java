import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Number  ");
        int number1 = sc.nextInt();
        System.out.print("Enter the second Number ");
        int number2 = sc.nextInt();
        int EBOB = 1;
        int EKOB;

        int n = Math.min(number1, number2);

        for (int i = 1; i <= n; i++) {
            if ((number1 % i == 0) && (number2 % i == 0)) {
                EBOB = i;
            }
        }
        EKOB = (number1 * number2) / EBOB;
        System.out.println("Ebob= " + EBOB);
        System.out.println("Ekob= " + EKOB);
    }
}
