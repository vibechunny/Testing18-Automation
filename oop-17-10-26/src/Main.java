//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    // VD1: quản lý về nhân viên
//        nhân viên fulltime, nhân viên partime
//        id, name, lương cơ bản
//        full time: bonus
//        part time: hours, rate

//        phân tích:
//        Employee - class cha
//        Fulltime - class con
//        Parttime - class con

    Employee[] listEmployee = {
            new FullTime("F01", "An", 10_000_000, 5_000_000),
            new Parttime("P01", "Binh", 10, 500_000)
        };

    for(Employee e: listEmployee){
        System.out.println(e.getName() + " - " + e.calculateSalary());
    }
    }
}