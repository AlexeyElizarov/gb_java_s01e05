
public class Main {
    public static void main(String[] args) {
        Employee[] staff = new Employee[5];
        staff[0] = new Employee("Кузьма", "Домовой", "fancy_kuzma@gmail.com", "+7 343 667 666", 100.15f, 115);
        staff[1] = new Employee("Фрекен Бок", "Хозяйка", "mamka_s_youtuba@gmail.com", "+7 343 546 782", 500.15f, 45);
        staff[2] = new Employee("Карлсон", "Трубочист", "chistiy_dymohod@gmail.com", "+7 343 898 214", 150.15f, 40);
        staff[3] = new Employee("Мойдодыр", "Баньщик", "anzor_sauna@gmail.com", "+7 343 872 014", 300.15f, 35);
        staff[4] = new Employee("Алёнушка", "Хостесс", "tyan_na_maximalkah@gmail.com", "+7 343 696 969", 250.15f, 25);

        for (int i = 0; i < staff.length; i++) {
            if (staff[i].getAge() >= 40) {
                staff[i].displayHRInfoRecord();
            }
        }
    }
}
