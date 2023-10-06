public class MainClass {
    public static void main(String[] args) {
        PayRollSystem system = new PayRollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee("Anand", 1, 76000);
        ParttimeEmployee emp2 = new ParttimeEmployee("Birju", 2, 90, 56);
        FullTimeEmployee emp3 = new FullTimeEmployee("Gobind", 3, 23900);
        system.addEmployee(emp1);
        system.addEmployee(emp2);
        system.dispplayEmployee();
        System.out.println(emp3.calculateSalary());
    }
}
