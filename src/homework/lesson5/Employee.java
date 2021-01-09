package homework.lesson5;


public class Employee {

    public String name;
    public String surname;
    public String patronymic;
    public String position;
    public String email;
    public String number;
    public String salary;
    public int age;

    public Employee(String name, String surname, String patronymic, String position, String email, String number, String salary, int age) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }
    public static void main(String[] args) {
        Employee person1 = new Employee("Sergei", "Akytin", "Aleksandrovich", "Designer", "Seakytin@yandex.ru", "89535513298", "45000", 27);
        printInfo(person1);
        Per();
    }
    private static void printInfo(Employee person1) {
        System.out.printf("Person1 name: %s; surname: %s; patronymic: %s; position: %s; email: %s; number: %s; salary: %s; age: %d%n",
                person1.name, person1.surname, person1.patronymic, person1.position, person1.email, person1.number, person1.salary, person1.age);

    }

    public static void Per() {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Gosha", "Vasin", "Petrovich", "Cleaner", "Gosha@mail.ru", "89536698547", "48000", 44);
        employees[1] = new Employee("Gena", "Losin", "Ivanovich", "Manager", "Gena@mail.ru", "89536647296", "50000", 48);
        employees[2] = new Employee("Lena", "Kozlova", "Artemovna", "Dancer", "Lena@mail.ru", "89536692698", "30000", 18);
        employees[3] = new Employee("Rosa", "Kuka", "Sergeevna", "Dancer", "Rosa@mail.ru", "89536696724", "32000", 19);
        employees[4] = new Employee("Vladimir", "Lunin", "Vladimirovich", "Security ", "Vova@mail.ru", "89536616487", "35000", 50);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].age > 40) {
                System.out.printf("name '%s'; surname: %s; patronymic: %s; position: %s; email: %s; number: %s; salary: %s; age: %d%n",
                        employees[i].name, employees[i].surname, employees[i].patronymic, employees[i].position, employees[i].email, employees[i].number, employees[i].salary, employees[i].age);
                 }
           }
       }
    }

