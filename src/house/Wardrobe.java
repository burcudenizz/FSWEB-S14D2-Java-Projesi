package house;

public class Wardrobe {

    private int width;
    private int height;
    private double weight;

    public Wardrobe(int width, int height, double weight) {
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void add(){
        System.out.println("Wardrobe added into Bedroom.");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("width:" + width + "\n");
        builder.append("height:" + height + "\n");
        builder.append("weight:" + weight + "\n");
        return builder.toString();
    }

}
