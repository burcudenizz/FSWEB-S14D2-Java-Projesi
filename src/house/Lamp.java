package house;

import enums.LampType;

public class Lamp {

    private LampType style;

    private Boolean battery;
    private int globRating;

    public Lamp(LampType style, Boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }


    public void turnOn() {
        System.out.println("Lamp is being turned on.");
    }

    public LampType getStyle() {
        return this.style;
    }

    public Boolean isBattery() {
        return this.battery;
    }

    public int getGlobRating() {
        return this.globRating;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("style:" + style + "\n");
        builder.append("battery:" + battery + "\n");
        builder.append("globrating: " + globRating + "\n");
        return builder.toString();
    }
}
