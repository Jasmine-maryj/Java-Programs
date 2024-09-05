import java.util.Scanner;

class Learn{
    public static void main(String[] args){
        System.out.println("Reloading and power up time");

        // System.out.println(Math.max(1, 10));
        // System.out.println(Math.sqrt(9));
        // System.out.println(Math.abs(-9.7));
        // System.out.println((int)(Math.random() * 101));

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter what your think now about your future:");
        String mind_status = sc.nextLine();

        System.out.println("Well Done!");
        System.out.println("Here is your result");

        System.out.println("Your name is " + name + " and you're " + age + " old. Your mind set is" + mind_status + ". You'll make it, you cosmos flower!");

        sc.close();
    }
}
