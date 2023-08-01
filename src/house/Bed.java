package house;

public class Bed {

    private String style;
    private int pillows;
    private int sheets;
    private int quilt;
    private int height;

    public Bed(String style, int pillows, int sheets, int quilt, int height) {
        this.style = style;
        this.pillows = pillows;
        this.sheets = sheets;
        this.quilt = quilt;
        this.height = height;
    }

    public void make() {
        System.out.println("The bed is being made.");
    }

    public int getPillows() {
        return this.pillows;
    }

    public int getQuilts() {
        return this.quilt;
    }

    public int getHeight() {
        return this.height;
    }


    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("style:" + style + "\n");
        builder.append("height:" + height + "\n");
        builder.append("pillows: " + pillows + "\n");
        builder.append("sheets: " + sheets + "\n");
        builder.append("quilt: " + quilt + "\n");
        return builder.toString();
    }

}
