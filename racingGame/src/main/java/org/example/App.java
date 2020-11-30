package org.example;

public class App
{
    public static void main( String[] args )  {
        Race race = new Race();

        Engine daciaEngine = new Engine();
        daciaEngine.manufacture = "Renault";

        RadioControlledCar dacia = new RadioControlledCar(daciaEngine);
        dacia.setName("Dacia");
        dacia.setColor("red");
        dacia.setDoorCount(4);
        dacia.setWeelCount(4);
        dacia.setMileage(8.5);

        Engine ladaEndige = new Engine();
        ladaEndige.manufacture = "Lada";

        RadioControlledCar lada = new RadioControlledCar(ladaEndige);
        lada.setName("Lada");
        lada.setColor("blue");
        lada.setDoorCount(4);
        lada.setWeelCount(4);
        lada.setMileage(8);

        race.firstCar = dacia;
        race.secondCar = lada;

        System.out.println(dacia.getName());
        System.out.println(lada.getName());

        System.out.println(RadioControlledCar.controlType);
        System.out.println(dacia.controlType);
        System.out.println(lada.controlType);

        dacia.setName("Dacia Logan");

        dacia.controlType = "Improved Radio Control";

        System.out.println("Changed value below.");

        System.out.println(dacia.getName());
        System.out.println(lada.getName());

        System.out.println("Values when called from class: " + RadioControlledCar.controlType);
        System.out.println("Values when called from dacia object: " + dacia.controlType);
        System.out.println("Values when called from lada object: " + lada.controlType);






    }
}
