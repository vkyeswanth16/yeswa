import java.util.Scanner;
public class datatype{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        float salary = sc.nextFloat();
        char Name = sc.next().charAt(0);
        System.out.println("age:"+age);
        System.out.println("salary:"+salary);
        System.out.println("Name:"+Name);
    }
}