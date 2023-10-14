public class FirstTask {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.brand = "bmw";
        car1.model = "m5";
        car1.speed = 250;
        car2.brand = "bmw";
        car2.model = "m3";
        car2.speed = 200;
        System.out.println(car1.brand + " " + car1.model + " " + car1.speed);
        System.out.println(car2.brand + " " + car2.model + " " + car2.speed);
    }
}

class Car {
    String brand;
    String model;
    int speed;
    public void stop(){
        System.out.println("STOPPPPP");
    }
    public void start(){
        System.out.println("STAAAAAAAAART");
    }
}
