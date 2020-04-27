package lesson6;

public class Cat extends Animals {

    public Cat (String name, String color, int age, int run, float jump,int swim){

      //  super();

        this.name = name;
        this.color = color;
        this.age = age;
        this.run= run;
        this.jump = jump;
        this.swim = swim;


    }
    @Override
    public void run() {
  //      Cat cat= new Cat ( " Merzic ", " Black ", 3, 200, 2,0);
       System.out.println(name +  " run " + run + " m");
    }

    public void swim() {
      //  Cat cat= new Cat ( " Merzic ", " Black ", 3, 200, 2);
        System.out.println(name + "can`t swim");
    }

    public void jump () {
        System.out.println(name + "jump " + jump + " m" );
    }


}
