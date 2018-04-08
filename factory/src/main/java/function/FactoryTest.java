package function;

import abstr.Farm;
import abstr.FoodFarm;

public class FactoryTest {
    public static void main(String[] args) {
        abstr.Farm farm = new FruitFarm();
        System.out.println(farm.getFood().getName());


        FoodFarm foodFarm = new FoodFarm();

        System.out.println(foodFarm.getVegetables().getName());
    }
}
