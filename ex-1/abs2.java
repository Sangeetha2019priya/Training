interface Vehiclee {
    void start();
    void stop();
}

 
abstract class Car implements Vehiclee {
@Override
    public void start() 
    {
        System.out.println("The car has started.");
    }

    public void stop()
    {
        System.out.println("The car stopped");
    }
}

 
class Siii extends Car {
    public void run()
    {
        System.out.println("Car is ruuning");
    }

}

 

public class abs2{

    public static void main(String[] args) {

        Vehiclee sedan = new Siii();
        sedan.start();
        sedan.stop();
        Siii obj = new Siii();
        obj.run();
    }

}

 
