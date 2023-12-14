package com.example.foodorderapp2;

import android.app.Application;
import androidx.room.Room;

public class MyApp extends Application{

    private FoodOrderDatabase appDatabase;

    @Override
    public void onCreate() {
        super.onCreate();

        //Initialize Room Database
        appDatabase = Room.databaseBuilder(getApplicationContext(), FoodOrderDatabase.class, "FoodOrderDatabase").build();
    }

    public FoodOrderDatabase getAppDatabase() {
        return appDatabase;
    }
}
