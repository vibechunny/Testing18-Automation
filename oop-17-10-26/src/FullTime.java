public class FullTime extends Employee{
    private double bonus;

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public FullTime(){ super(); }

    public FullTime(String id, String name, int baseSalary, double bonus){
        super(id,  name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary(){
        return super.getBaseSalary() + bonus;
    }
}
