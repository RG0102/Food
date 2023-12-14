package com.example.foodorderapp2;
import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities =  {FoodOrder.class}, version =1)
public abstract class FoodOrderDatabase extends RoomDatabase {


    public abstract FoodOrderDao getFoodOrderDao();
}

