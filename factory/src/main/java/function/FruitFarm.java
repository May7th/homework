package function;

import abstr.Farm;
import abstr.Food;

public class FruitFarm implements Farm {
    public Food getFood() {
        return new Fruit();
    }
}
