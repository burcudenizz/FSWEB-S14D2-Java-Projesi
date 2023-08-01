package house;

import enums.PaintColor;

public class Ceiling {

    private int height;

    private PaintColor paintedColor;


    public Ceiling(int height, PaintColor paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }


    public int getHeight() {
        return height;
    }

    public PaintColor getPaintedColor() {
        return paintedColor;
    }

    public void create() {
        System.out.println("height of ceiling:" + this.getHeight() + "color of ceiling" + this.getPaintedColor());
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("height:" + height + "\n");
        builder.append("paintedColor:" + paintedColor + "\n");
        return builder.toString();
    }
}
