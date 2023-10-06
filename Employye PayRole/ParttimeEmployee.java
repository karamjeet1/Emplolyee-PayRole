public class ParttimeEmployee extends Employee {
    private double hourWork;
    private double hourRate;

    public ParttimeEmployee(String name, int id, double hourRate, double hourWork) {
        super(name, id);
        this.hourWork = hourWork;
        this.hourRate = hourRate;
    }

    @Override
    public double calculateSalary() {
        return hourRate * hourWork;

    }
}
