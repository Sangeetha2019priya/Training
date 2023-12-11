import java.lang.reflect.Method;

class an{
    public static void main(String args[])throws Exception{

    hellooo h=new hellooo();
    h.sayHello();
Method m=h.getClass().getMethod("sayHello");

MyAnnotation manno=m.getAnnotation(MyAnnotation.class);
System.out.println("value is: "+manno.value());
}}

