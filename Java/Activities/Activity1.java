public class Activity1 {

    public static void main(String[] args) {
        Car Honda = new Car();
        Honda.make = 2015;
        Honda.color = "White";
        Honda.transmission = "Manual";

        //Using Car class method
        Honda.displayCharacterstics();
        Honda.accelerate();
        Honda.brake();
    }

}
