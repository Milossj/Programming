import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;

public class hgfd {
//bro code java
   /*basic
   public static void main(String [] args) {
        System.out.println("bye");
        int x = 123;
        boolean y = true;
        char s = '#';
        String b = "sdsddd";
        System.out.println("My number is: " + y);
    }*/

   /* changing the assignmnet
   public static void main(String [] args){
        String x = "water";
        String y = "coolaid";
        String temp;

        temp = x;
        x = y;
        y = temp;
       System.out.println("x:" +x);
       System.out.println("y:" +y);
   }*/
   /* scanner
   public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("name:");
       String name = sc.nextLine();

       System.out.println("hello" + name);
       System.out.println("old:");
       int age = sc.nextInt();
       System.out.println("hello " +name + age);
   }*/
   /* expressions
   public static void main(String [] args){

       double friends = 18;
       friends = (double) friends/5;
       friends++;
       System.out.println(" "+ friends);

   }*/
  /*basic gui
   public static void main(String [] args){

       String name = JOptionPane.showInputDialog("Enter your name:");
       JOptionPane.showMessageDialog(null, "Hello" +name);

        int age =Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
    JOptionPane.showMessageDialog(null, "You are: " +age);

    double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height:"));
    JOptionPane.showMessageDialog(null,"You are " +height+ " cm tall");
   }*/
   /*Math class
   public static void main(String [] args){

       double x = 3.14;
       double y = -10;

       double z = Math.max(x, y);
       System.out.println(z);

        double b = Math.abs(y);

       double a = Math.min(x, y);
       System.out.println(a);

       double c = Math.sqrt(x);

       double f = Math.round(x);

       double d = Math.ceil(x); //round up

       double e = Math.floor(x); //round down
       //hypotenuse
        double k;
        double p;
        double o;
        Scanner scanner = new Scanner(System.in);

       System.out.println("Enter side k:");
        k = scanner.nextDouble();

       System.out.println("Enter side p:");
       p = scanner.nextDouble();

      z = Math.sqrt((x*x)+(y*y));
       System.out.println("Hypotrnuse is:" + z);

       scanner.close(); //closing the scanner wow
   }*/
   /*random
   public static void main(String [] args){


       Random random = new Random(); //pseudo random numbers
        int x = random.nextInt(6)+1; //between 0 and 5 you know why
       System.out.println(x);

       double y = random.nextDouble(); //between 0 and 1
       System.out.println(y);

       boolean z = random.nextBoolean(); // true or false
       System.out.println(z);
   } */
   public static void main(String [] args){

       int age = 12;//or 18
       if (age>=18) {
           System.out.println("an adult");
       }






   }
}



