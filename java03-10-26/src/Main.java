import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // ôn lại mô hình 3 khối
    // Bai 1: tinh chu vi dien tich hinh chu nhat

    public  static void TinhChuVDienTich(float dai, float rong) {
        if (dai <= 0 || rong <= 0) {
            System.out.println("Chieu dai, chieu rong khong hop le");
            return;
        }

        float chuVi = (dai + rong) * 2;
        float dienTich = dai * rong;

        System.out.println("Chu vi: " + chuVi);
        System.out.println("Dien tich: " + dienTich);
    }

    // Bai 3: tinh hoc luc hs dua vao diem trung binh
    // input: diem trung binh
    // output: hoc luc
    // process: if else

    public static void KiemTraHocLuc(float diemTB) {
        if (diemTB < 0 || diemTB > 10) {
            System.out.println("Diem khong hop le!");
            return;
        }

        if (diemTB >= 9) {
            System.out.println("Hoc sinh xuat sac");
        }
        else if (diemTB >= 8) {
            System.out.println("Hoc sinh gioi");
        }
        else if (diemTB >= 6.5) {
            System.out.println("Hoc sinh kha");
        }
        else if (diemTB >= 5) {
            System.out.println("Hoc sinh trung binh");
        }
        else {
            System.out.println("Hoc sinh yeu");
        }


    }

    // Bai 4: tinh tien dien
    // input: so kWh
    // output: so tien
    // process: if else

    public static void TinhTienDien(float kWh) {
//        bac 1: 1-50kWh -> 1800
//        bac 2: 51-100: 2000
//        bac 3: 101-200: 2500
//        bac 4: 3000

        if (kWh < 0) {
            System.out.println("Input khong hop le!");
        }
        float temp = 0;
        float total = 0;
        if (kWh > 200) {
            temp = kWh - 200;
            System.out.println("Bac 4: " + temp + " kWh");
            total += temp * 3000;
            System.out.println("So tien bac 4: " + temp * 3000 + " đ");
            kWh -= temp;
        }
        if (kWh > 100) {
            temp = kWh - 100;
            System.out.println("Bac 3: " + temp + " kWh");
            total += temp * 2500;
            System.out.println("So tien bac 3: " + temp * 2500 + " đ");
            kWh -= temp;
        }
        if (kWh > 50) {
            temp = kWh - 50;
            System.out.println("Bac 2: " + temp + " kWh");
            total += temp * 2000;
            System.out.println("So tien bac 2: " + temp * 2000 + " đ");
            kWh -= temp;
        }
        if (kWh > 0) {
            System.out.println("Bac 1: " + kWh + " kWh");
            total += kWh * 1800;
            System.out.println("So tien bac 1: " + kWh * 1800 + " đ");
        }

        System.out.println("So tien: " + total);
    }


    public static void main(String[] args) {
        // Bai 1: tinh chu vi dien tich hinh chu nhat
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Bai 1: tinh chu vi dien tich hinh chu nhat");
//        System.out.printf("Nhap chieu dai: ");
//        float dai = Float.parseFloat(sc.nextLine());
//
//        System.out.printf("Nhap chieu rong: ");
//        float rong = Float.parseFloat(sc.nextLine());
//
//        TinhChuVDienTich(dai, rong);

        // Bai 3: tinh hoc luc hs dua vao diem trung binh
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Bai 3: tinh hoc luc hs dua vao diem trung binh");
//        System.out.printf("Nhap diem trung binh: ");
//        float diemTB = Float.parseFloat(sc.nextLine());
//        KiemTraHocLuc(diemTB);

        // Bai 4: Tinh tien dien
        Scanner sc = new Scanner(System.in);
        System.out.println("Bai 4: Tinh tien dien");
        System.out.printf("Nhap so dien: ");
        float kWh = Float.parseFloat(sc.nextLine());
        TinhTienDien(kWh);
    }
}