package com.example.foodorderapp2;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface FoodOrderDao {

    @Insert
    void insertFoodOrder(FoodOrder foodOrder);

    @Query("SELECT * FROM food_order")
    List<FoodOrder> getAllFoodOrders();
}
