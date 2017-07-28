package extendTest;

/**
 * Created by Ykue on 2017/7/14.
 */
public class Peson {
    public String sex;
    public Inter inter = new InterImpl();
     int age;
     public void walk(){
         System.out.println("extendTest.Peson can walk");
     }
     public void sing(){
         System.out.println(("extendTest.Peson can sing"));
     }
     public void eat(){
         inter.eat();

     }
}
