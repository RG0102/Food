package com.example.foodorderapp2;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "food_order")
public class FoodOrder {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private int foodOrderId;
    private String foodName;
    private double foodPrice;

    //Constructor, getters, and setters

    //Constructor
    public FoodOrder(int foodOrderId, String foodName, double foodPrice) {
        this.foodOrderId = foodOrderId;
        this.foodName = foodName;
        this.foodPrice = foodPrice;
    }


    //Default constructor for FoodOrder()
    public FoodOrder() {

    }
    //Getter and setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFoodOrderId() {
        return foodOrderId;
    }

    public void setFoodOrderId(int foodOrderId) {
        this.foodOrderId = foodOrderId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }
}
