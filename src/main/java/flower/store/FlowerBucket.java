package flower.store;

// import lombok.Getter;
// import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

//@Getter @Setter
public class FlowerBucket {

    // method price

    private List<FlowerPack> bucket = new ArrayList<FlowerPack>();
    public void add(FlowerPack flowerPack) {
        bucket.add(flowerPack);
    }

    public double getPrice() {
        double price = 0;

        for (FlowerPack pack: bucket){
            price += pack.getPrice();
        }
        return price;
    }
}
