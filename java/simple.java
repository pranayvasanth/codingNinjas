import java.util.*;

public class simple {
    
    public static void main( String args[])
    {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your name");
        String n=sc.nextLine();
        System.out.println("Enter your age");
        int a=sc.nextInt();
        if(a>=18)
        {
            System.out.println("Your an Adult");
            System.out.println("Name:"+n);
            System.out.println("Age:"+a);
        }
        else{
            System.out.println("Not an Adult");
        }
    }
}
