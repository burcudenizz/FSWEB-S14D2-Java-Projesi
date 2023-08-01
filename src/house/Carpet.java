package house;

import enums.Colors;

public class Carpet {
    private int width;
    private int height;
    private Colors color;


    public Carpet(int width, int height, Colors color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Colors getColor() {
        return color;
    }

    public void lying() {
        System.out.println("Carpet is lying on Bedroom floor.");
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("width:" + width + "\n");
        builder.append("height:" + height + "\n");
        builder.append("color: " + color + "\n");
        return builder.toString();
    }

}
