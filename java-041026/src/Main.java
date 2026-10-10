import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean isPrime(int n) {
        if (n == 2) return true;
        //dgdhgudhgidhti
        if (n < 2) {
            return false;
        }
        for (int i=2; i < n-1; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.printf("Input n: ");
//        int number = Integer.parseInt(sc.nextLine());
//        if (isPrime(number)) {
//            System.out.printf("So nguyen to");
//        } else {
//            System.out.printf("KHONG phai s nguyen to");
//        }
        for (int i=1; i<=100; i++) {
            System.out.println(i + ": " + isPrime(i));
        }

    }
}