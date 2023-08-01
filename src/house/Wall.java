package house;

import enums.Directions;

public class Wall {

    private Directions direction;

    public Wall(Directions direction) {

        this.direction = direction;
    }

    public Directions getDirection() {
        return direction;
    }

    public void creeate() {
        System.out.println("this wall is directed  to " + this.getDirection());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("direction:" + direction + "\n");
        return builder.toString();
    }

}
