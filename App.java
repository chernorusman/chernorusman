import java.util.*;

public class App {

    public static void main(String[] args) throws InterruptedException {

        Human James = new Human("James", 25, "22/06/1995");
        Human Alhaji = new Human("Alhaji", 24, "01/02/1996");
        Human Evelyn = new Human("Evelyn", 30, "06/03/1990");
        Human Raymond = new Human("Raymond", 19, "01/06/1997");

        James.eat("Rice");
        Thread.sleep(2000);

        Evelyn.sing("Jesus you love me too much oo");
        Thread.sleep(2000);

        Human[] humans = { James, Alhaji, Evelyn, Raymond };

        for (int i = 0; i < humans.length; i++) {
            System.out.println(humans[i].getName());
        }

        // data type, variable name
        //Car firstCar = new Car("Black", 75, 4, true);
       Car firstCar = new Car();
        firstCar.setCarName("Benz");
        firstCar.setColor("Black");
        firstCar.setFuelCapacity(75);
       firstCar.setisAutomatic(true);

        Car secondCar = new Car("Second Car", "Red", 60, false, false, true, 2,
        true);
        Car thirdCar = new Car("Third Car", "Grey", 70, true, true, true, 4, true);
        Car fourthCar = new Car("Fourth Car", "Pink", 60, true, false, true, 4,
        true);
        Car fifthCar = new Car("Fifth Car", "White", 50, false, false, true, 2,
         true);

        fourthCar.setColor("Dark Brown");
        Car[] carArray = { firstCar, secondCar, thirdCar, fourthCar, fifthCar };

        // secondCar.driveCar();

        // Thread.sleep(3000);

        // thirdCar.driveCar();

        List<Car> ourManualCars = Car.getAllManualCar(carArray);

        for (int j = 0; j < ourManualCars.size(); j++) {
        System.out.println(ourManualCars.get(j).getCarName());
        System.out.println(ourManualCars.get(j).getColor());
        System.out.println(ourManualCars.get(j).getFuelCapacity());
        System.out.println(ourManualCars.get(j).getisAutomatic());
        System.out.println("\n");
        }

        System.out.println(Car.NUMBER_OF_CARS);

        // To assign to the object we use the dot(.) operator
        firstCar.setColor("White");
        firstCar.setFuelCapacity(79);

        int _capacity = firstCar.getFuelCapacity();
        String _color = firstCar.getColor();

        System.out.println("Color of the car is: " + _color);
        System.out.println("Fuel capacity of the car is: " + _capacity);

    }
}
