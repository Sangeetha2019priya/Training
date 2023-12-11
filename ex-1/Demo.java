class Animal
{
    public String repColor = "brown";
     public void display() 
     {
        System.out.println(repColor);
     }
}

class Reptile extends Animal
{
    String repColor = "green";
    public void display() 
     {
      
        System.out.println(repColor);
       System.out.println(super.repColor); 
     }
}

public class Demo {
   public static void main(String args[]) 
   {
      Animal rep = new Reptile();
      rep.display();
   }
}
