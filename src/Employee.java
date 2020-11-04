public class Employee {
    public String name;
    public String position;
    public String email;
    public String phone;
    float salary;
    int age;

    public Employee(){
    }

    public Employee(String name, String position, String email, String phone, float salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayHRInfoRecord() {
        System.out.printf("ФИО: %s\n" +
                "Должность: %s\n" +
                "e-mail: %s\n" +
                "Телефон: %s\n" +
                "Оклад: %s\n" +
                "Возраст: %s\n\n", name, position, email, phone, getSalary(), getAge());
    }
}
