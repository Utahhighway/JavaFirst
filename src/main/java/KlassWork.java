public class KlassWork {
  /// Черновик по методичке


//    private final int id;


    //public class User {
    private int id;
    private String name;
    private String color;
    private int age;

   public KlassWork(String name, String color) {
    }


//    public static void main (String [] ages) {
//        System.out.println( "Содержание методички");
//    }
//   }
    //// Почему так не задает
//    public KlassWork(int id, String name, String position, int age) {
//       // this.id = id;
//        this.name = name;
//        this.position = position;
//        this.age = age;
//        this.color = color;
    //   }
//
//    public void info() {
//        System.out.println();
 //   }

    public static void main (String [] args) {
        KlassWork cat1 = new KlassWork ("Барсик","Белый");
        //KlassWork cat2 = cat1;
        //cat1.name = "Барсик";
       // cat1.color = "Белый";
        //cat2.name = "Мурзик";
      //  cat2.color = "Черный";
     //   cat2.age = 4;
       // KlassWork cat1 = new KlassWork;
       // KlassWork cat2 = cat1;
        System.out.println ("Cat`s name: " + cat1.name + " color:" + cat1.color);
      //  System.out.println ("Cat`s name: " + cat2.name + " color: " + cat2.color + " age:" + cat2.age);


    }
}



