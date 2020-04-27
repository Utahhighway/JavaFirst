package lesson6;

public class Animals {
   String name;
   String color;
   int age;
   int run;
   float jump;
   int swim;


    public Animals(String color, int age, int run, float jump, int swim) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.run= run;
        this.jump = jump;
        this.swim = swim;
        int a = 15;

    }

    public Animals(String name, String color, int age, int run, float jump, int swim) {
    }

    public Animals() {

    }


    public void run () {
    System.out.println(name +  "run");
    }

    public void runL (int a){
        if (a < run) {
            System.out.println("true");
        }
        if (a == run) {
            System.out.println("true");
        }
        if (a > run) {
            System.out.println("true");
        }
    }
//     public void runLen (int a) {
//
//      if (a < run);{
//            System.out.println(name +  "run");


//        if (runLength <= run) {
//            return "true";        }
 //   }
//    public void runLength( int a){
//        Dog dog = new Dog ( " Tuzic " , " White ", 4, 500, (float) 0.5, 10);
//
//        if (a <= run); {
//            System.out.println( "true");
//        }
////int a= 5;
    public void swim () {
        System.out.println(name + "swim");
//               if (a < run);{
//            System.out.println("true");
//        }
//        if (a == run); {
//            System.out.println("true");}
//            if ( a > run) {
//                System.out.println("false");}
    }

    public void jump () {
        System.out.println(name + "jump");
    }
    public void info () {
        System.out.println( name + color + age );
    }
    }




