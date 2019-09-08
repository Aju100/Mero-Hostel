public class Car{
    int maxSpeed = 100;
    int minSpeed = 0;
    double weight = 4079; // pounds
    boolean isTheCarOn = false ;// 0 means false
    char condition ='A';
    String nameOfCar = "BMW";

    double maxFuel = 16;
    double currentFuel = 8;

    public void printVariables(){
        System.out.println("The Name of Car is "+nameOfCar);
        System.out.println("Maximum Speed of Car is "+maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
               
    }

    public void wreckCar(){
        maxSpeed = 200;
        condition = 'C';
    }
    public void upgradeMinSpeed(){
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed+1;
    }

    public static void main(String[] args){
        // lets create instance
        Car familyCar = new Car();
        System.out.println("Family's Car:");
        familyCar.printVariables();
        familyCar.upgradeMinSpeed();
        familyCar.printVariables();

        // new Car Properties
        Car AliceCar = familyCar;
        familyCar.wreckCar();
        System.out.println("Alice's Car:");
        AliceCar.printVariables();

    }
}

/*
OUTPUT:
100
0
4079.0
false
A
*/