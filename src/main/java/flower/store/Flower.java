package flower.store;

import lombok.Setter;
import lombok.Getter;

@Setter
public class Flower {
    @Getter
    private FlowerType flowerType;

    @Getter
    private double flowerLenght;
    private FlowerColor color;

    @Getter
    private double price;

    public String getColor() {
        return color.toString();
    }
//    public FlowerType getType() {
//        return flowerType;
//    }
}
