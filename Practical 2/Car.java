public class Car {
    String carNumber;
    String modelName;
    String colour;
    double price;

    void displayDetails() {
        System.out.println("Car Number: " + carNumber);
        System.out.println("Model Name: " + modelName);
        System.out.println("Colour: " + colour);
        System.out.println("Price: ₹" + price);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.carNumber = "MH 49 AB 0010" ;
        car1.modelName = "SUV";
        car1.colour = "Metallic Black";
        car1.price = 450000;

        // Creating second car object
        Car car2 = new Car();
        car2.carNumber = "MH 49 BC 5784";
        car2.modelName = "Sedan";
        car2.colour = "Green";
        car2.price = 1200000;

        Car car3 = new Car();
        car3.carNumber = "MH 40 CD 9874";
        car3.modelName = "Sedan";
        car3.colour = "White";
        car3.price = 6549887;


        car1.displayDetails();
        car2.displayDetails();
        car3.displayDetails();
    }
}


