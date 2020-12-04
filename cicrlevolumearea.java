import java.util.Scanner;
public class scratch_4 {
    public static void main(String[] args) {
        do {
            welcome();
            decision();
            in();
        } while(in()>0);
       }
    public static void welcome(){
        System.out.println("welcome to the calculator!");
        System.out.println("would you like to do area or volume");

    }

    public static void decision(){
        Scanner scan = new Scanner(System.in);
        String decide = scan.next();
        if (decide.equals("area")) {
            area();
        } else if (decide.equals("volume")) {
            volume();
        } else {
            System.out.println("this request is not supported please restart the program and try again");
        }
    }

    public static double in(){
        Scanner scan = new Scanner(System.in);
        double input = scan.nextDouble();

        return input;
    }

    public static void area(){
       System.out.println("please input radius");
       double radius = in();
       double a = 3.14 * Math.pow(radius,2);
       System.out.println("your area is "+String.format("%.2f",a));
    }
    public static void volume(){
        System.out.println("please input radius");
        double radius = in();
        double a =  4.00/3.00 * 3.14 * Math.pow(radius,3);
        System.out.println("your volume is "+String.format("%.2f",a));

    }

}
