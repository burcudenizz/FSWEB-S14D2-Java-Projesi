package main;

import enums.Colors;
import enums.Directions;
import enums.LampType;
import enums.PaintColor;
import house.*;

public class Main {
    public static void main(String[] args) {


        Bedroom bedroom1 = new Bedroom("Burcu",
                new Wall(Directions.NORTH),
                new Wall(Directions.SOUTH),
                new Wall(Directions.WEST),
                new Wall(Directions.EAST),
                new Ceiling(3, PaintColor.ACRILIC),
                new Lamp(LampType.LED, true, 200),
                new Bed("double", 4, 3, 1, 1),
                new Wardrobe(2, 2, 100),
                new Carpet(2, 3, Colors.GREEN));


        System.out.println(bedroom1);
        System.out.println("***********************");

        bedroom1.getBed().make();
        bedroom1.getLamp().turnOn();
        bedroom1.getCeiling().create();
        bedroom1.getCarpet().lying();

        System.out.println(bedroom1.getCarpet().getColor());
        System.out.println(bedroom1.getLamp().getGlobRating());
    }
}