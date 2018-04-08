package abstr;

import function.Fruit;
import function.Vegetables;

public class FoodFarm extends AbstractFarm{
    @Override
    public abstr.Food getVegetables() {
        return new Vegetables();
    }

    @Override
    public abstr.Food getFruit() {
        return new Fruit();
    }
}
