import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        1. Câu lệnh nhập xuất dữ liệu
        System.out.println("Hello Vi");

        //    Biến (variable)
//    <kiểu dữ liệu> <tên biến>
//    <kiểu dữ liệu> <tên biến> = <giá trị mặc định>
//    quy tắc đặt tên biến: camel case

        int num1 = 10;
        System.out.println(num1);

        float num2 = 10.1f;
        System.out.println(num2);

        boolean isActive = true;
        System.out.println(isActive);

        char ch = 'a';
        System.out.println(ch);

        String str = "Hello VI";
        System.out.println(str);


//  HẰNG SỐ
        final int HOURS_PER_DAY = 24;

        // NHẬP
        Scanner sc = new Scanner(System.in);
//        System.out.println("Please input number: ");
//        int numberInt = sc.nextInt();
//
//        System.out.println("Please input float number: ");
//        float numberFloat = sc.nextFloat();
//        System.out.println("Your float number: " + numberFloat);

        //sc.nextLine(); //bypass buffer
        System.out.println("Please input string: ");
        String str1 = sc.nextLine();
        System.out.println("Your string: " + str1);

    }
}