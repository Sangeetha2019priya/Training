

class Sample
{
      
    public static void main (String[] args)
    {
      
        // creating the Objects of Geek class.
        Geek g1 = new Geek("aa", 1);
        //Geek g2 = new Geek("aa", 1);
        Peek p1 = new Peek("aa", 1);
          
        // comparing above created Objects.
        if(g1.hashCode() == p1.hashCode())
        {
  
            if(g1.equals(p1))
                System.out.println("Both Objects are equal. ");
            else
                System.out.println("Both Objects are not equal. ");
      
        }
        else
        System.out.println("Both Objects are not equal. "); 
    } 
}
