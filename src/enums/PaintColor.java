package enums;

public enum PaintColor {

    PLASTIC("white", "matt"),
    WATERBASED("gray", "polished"),

    ACRILIC("cream", "matt");


    private String color;
    private String opacity;


    PaintColor(String color, String opacity) {
        this.color = color;
        this.opacity = opacity;
    }
}
