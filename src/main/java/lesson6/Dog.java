package lesson6;

public class Dog extends Animals {



    public Dog(String name, String color, int age, int run, float jump, int swim) {
        //super();
        super(name,color, age, run, jump, swim);
        this.name = name;
        this.color = color;
        this.age = age;
        this.run= run;
        this.jump = jump;
        this.swim = swim;

    }



    public void swim() {
    }

   @Override
   public void run () {
//        if (a < run) {
//            System.out.println("true");;
//        }
////        Dog dog = new Dog(" Tuzic ", " White ", 4, 500, (float) 0.5, 10);
      System.out.println(name + " run " + run + " m");
    }

//    public static boolean ( int a){
//        Dog dog = new Dog ( " Tuzic " , " White ", 4, 500, (float) 0.5, 10);
//
//        if (a <= run); {
//            System.out.println( "true");
//        }
//        }


//    public void swim () {
//
//        System.out.println(name + " swim " + swim + "m");
//    }

    public void jump() {
        System.out.println(name + "jump " + jump + " m");
    }
}



