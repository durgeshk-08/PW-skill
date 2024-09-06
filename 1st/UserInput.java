import java.util.Scanner;

class UserInput
{
    public static void main (String []args)
    {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter the name");
        String name = scan.next();

        System.out.println("Enter your age");
        int age = scan.nextInt();

        System.out.println("Enter your avg");
        int avg = scan.nextInt();


        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
        System.out.println("avg is " + avg);
    }
}