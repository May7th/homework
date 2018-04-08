package function;

import abstr.Farm;
import abstr.Food;

public class VegetablesFarm implements Farm {
    public Food getFood() {
        return new Vegetables();
    }
}
