public class PersonDemo {
    private String name;
    private int age;
    private String country;

    public PersonDemo(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "[Name=" + getName() + ", Age=" + getAge() + ",Country=" + getCountry() + "]";
    }
}

class Person {
    public static void main(String[] args) {
        PersonDemo p = new PersonDemo("Rahul", 23, "India");
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
        System.out.println("Country: " + p.getCountry());

        p.setName("Ramayan");
        p.setAge(22);
        p.setCountry("USA");
        System.out.println(p.toString());
        ;
    }
}
