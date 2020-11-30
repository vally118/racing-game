package org.example;

public class Vehicle {


   public static  String controlType = "Radio Control";
   private String name;
   private String color;
   private int weelCount;

    public double acceletate (double speed) {
        System.out.println (speed);
        return 10.5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeelCount() {
        return weelCount;
    }

    public void setWeelCount(int weelCount) {
        this.weelCount = weelCount;
    }
}
