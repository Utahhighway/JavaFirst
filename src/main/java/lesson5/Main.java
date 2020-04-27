package lesson5;

public class Main {
         // 3.  Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль

    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivanov I I", "engineer", "Ivanov722@mail.ru", "891955514748", 80000, 38);
        employee1.info();

        // 4. Создать массив из 5 сотрудников

       Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov I I", "engineer", "Ivanov722@mail.ru %n", "891955514748", 80000, 38);
        employees[1] = new Employee("Sidorov N.N.", "clerk", "Sidorov722@mail.ru", "891955514748", 40000, 48);
        employees[2] = new Employee("Duyshin L.L.", "loader", "P722@mail.ru", "891988514748", 20000, 29);
        employees[3] = new Employee("Pavlov U.Y.", "engineer", "I382@mail.ru", "891458514748", 50000, 40);
        employees[4] = new Employee("Kirov K.L.", "driver", "D721@mail.ru", "89195545718", 30000, 49);

        for (Employee employee : employees) {
            employee.info();
        }

//        //      5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
//        for (int i = 0; i < employees.length; i++) {
//            if (employees[i].getAge() > 40) {
//                employees[i].info();
  //          }
//
 //       }
    }
}