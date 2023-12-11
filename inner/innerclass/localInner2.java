
public class localInner2
{
    private int data=30;//instance variable
    void display(){
    int value=50;//local variable must be final

    class LocalInner
    {
        void msg()
        {
            System.out.println(value);
            System.out.println(data);
        }//C.T.Error
        }
        LocalInner l=new LocalInner();
        l.msg();
     }
  @SuppressWarnings("all")

 public static void main(String args[]) throws Exception{
  localInner2 obj=new localInner2();
  obj.display();
  
  System.out.println(obj.data);
 }
}

