 abstract class Bike{  
   Bike()
   {
        System.out.println("bike is created");
    }  
   abstract void run();
    
   void changeGear()
   {
        System.out.println("gear changed");
    }  
 }  
//Creating a Child class which inherits Abstract class  
 class Honda extends Bike
 {  
    void run()
    {
        System.out.println("running safely..");
    }  

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;
          
        
        if(obj == null || obj.getClass()!= this.getClass())
            return false;
          
       
        Geek geek = (Geek) obj;
          
        return (geek.name == this.name && geek.id == this.id);
    } 
 }  
 


//Creating a Test class which calls abstract and non-abstract methods  
 public class abs1{  
    public static void main(String args[]){  
         Bike obj = new Honda();  
         obj.run();  
        obj.changeGear();  

        Bike obj1 = new Honda();  
        System.out.println(obj.equals(obj1));
       System.out.println(obj);
       System.out.println(obj1);


        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());

       

        System.out.println(obj.toString());
        System.out.println(obj1.toString());
 }  
}  


