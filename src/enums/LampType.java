package enums;

public enum LampType {

    LED("daylight",1500),
    FLUORESCENT("white",1000),
    REFLECTOR("yellow",850);

    private String lightColor;
    private int luxAmount;


    LampType(String lightColor, int luxAmount) {
        this.lightColor = lightColor;
        this.luxAmount = luxAmount;
    }

    public String getLightColor() {
        return lightColor;
    }

    public void setLightColor(String lightColor) {
        this.lightColor = lightColor;
    }

    public int getLuxAmount() {
        return luxAmount;
    }

    public void setLuxAmount(int luxAmount) {
        this.luxAmount = luxAmount;
    }
}
