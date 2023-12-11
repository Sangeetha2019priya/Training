package memberclass;

class Member{  
 private int data=30;  
 class Inner{  
  void msg(){System.out.println("data is "+data);}  
 }  
 public static void main(String args[]){  
  Member obj=new Member();  
  Member.Inner in=obj.new Inner();  
  in.msg();  
 }  
}  