package lesson5;

public class Employee {

    //1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
     //Можно задавать имена переменных на русском?
    String fullName;
    String  duties;
    String email;
    String phoneNumber;
    int salary;
    int age;


    //2. Конструктор класса должен заполнять эти поля при создании объекта;

    public Employee (String fullName, String duties, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.duties = duties;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.salary= salary;
        this.age=age;
    }



     public void  info () {
           System.out.printf("Employee, %s, %s, %s, %s, %d,%d. %n", fullName, duties, email, phoneNumber, salary, age);

        }

    }





