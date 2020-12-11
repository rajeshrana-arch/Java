package org.practice.enums;
import java.util.Map;
import java.util.EnumMap;

enum SoftDrinks {
    COKE("COKE", 75), PEPSI("PEPSI", 90), SODA("SODA", 900);
    private String title;
    private int price;
    private SoftDrinks(String drinkName, int price){
        this.title=drinkName;
        this.price=price;
    }
    public String getTitle(){
        return title;
    }
    public int getPrice(){
        return price;
    }
    @Override
    public String toString() {
        return title;
    }

}

public class SoftDrinkEnum {
    public static void main(String[] args){
        Map<SoftDrinks, Integer> store = new EnumMap<SoftDrinks, Integer>(SoftDrinks.class);
        for(SoftDrinks drink: SoftDrinks.values()){
            store.put(drink, 10);
        }
        // Print the Store
        for(Map.Entry<SoftDrinks, Integer> entry: store.entrySet()){
            System.out.println("KeyName :" + entry.getKey() + " Qty:" + entry.getValue() + " Price:"+ entry.getKey().getPrice());
        }
    }
}
