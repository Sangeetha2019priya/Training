import java.util.Scanner;

class User
{
     String s1 = "Sangeetha";
     String p1 = "Sangee1@";
      
    public void valid(String s2,String p2)
    {
        if((s1.equals(s2)) && (p1.equals(p2)))
        {
            System.out.println("Logged in");
        }
        else
        {
            System.out.println("invalid username & Password");
        }
    }

}
   
public class Password{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username:");
        String s2 = sc.nextLine();
        System.out.println("Enter your Password:");
        String p2 = sc.nextLine();
        sc.close();

        User obj = new User();
        obj.valid(s2,p2);
            
}
}
