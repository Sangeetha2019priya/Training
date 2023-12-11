

 interface LivingBeings { 
    public int a=1;
static public void Type()
{
    System.out.println("Omnivorous"+a);
}
default public void LayEgg()
{
    System.out.println("Yes It Lay Eggs");
}
    void title();
}
 abstract class Birds implements LivingBeings {
    public void title()
    {
        System.out.println("Birds");
    }
    public void Fly()
    {
        System.out.println("hello");
    }
    abstract void Eat();
    abstract void Walk();
    abstract void Color();
    
    
}

class Eagle extends Birds {
    // void Fly() {
    //     System.out.println("It can Fly");
    // }
    public int a;
    public int b;
    Eagle(int a,int b)
    {
        this.a=a;
        this.b=b;
        System.out.println(a+""+b);
    }
    void Eat() {
        System.out.println("It can Eat other animal flush");
    }
    void Walk() {
        System.out.println("It can walk");
    }
    void Color() {
        System.out.println("Brown");
    }
    @Override
    public boolean equals(Object obj)
    {
          
    // checking if both the object references are 
    // referring to the same object.
    if(this == obj)
            return true;
          
        // it checks if the argument is of the 
        // type Geek by comparing the classes 
        // of the passed argument and this object.
        // if(!(obj instanceof Geek)) return false; ---> avoid.
        if(obj == null || obj.getClass()!= this.getClass())
            return false;
          
        // type casting of the argument. 
        Eagle geek = (Eagle) obj;
          
        // comparing the state of argument with 
        // the state of 'this' Object.
        return (geek.a == this.a && geek.b == this.b);
    }
    
}

/**
 * test1
 */
 public class Tamil  {

    public static void main(String[] args) {
        int x=10;
        int y=x;
    System.out.println(x==y);
        Eagle Eg=new Eagle(1,2);
        // Eg.Color();
        // Eg.Eat();
        // Eg.LayEgg();
        // Eg.title();
        Eagle Eg1=new Eagle(1,2);
         System.out.println("Equals "+Eg1.equals(Eg));
         System.out.println(Eg1);
         System.out.println(Eg.hashCode());
         System.out.println(Eg1.hashCode());
         System.out.println(Eg.toString());
         System.out.println(Eg1.toString());
        System.out.println(LivingBeings.a);
        LivingBeings.Type();

    }
}