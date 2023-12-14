package com.example.foodorderapp2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class FoodOrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_order);

        //Retrieve the food order ID from the intent
        int foodOrderId = getIntent().getIntExtra("foodOrderId", -1);

        //Order Button in activity_food_order.xml
        Button orderButton = findViewById(R.id.orderButton);

        //Set an OnClcikListener for the orderButton
        orderButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //When the button is clicked, create an intent to navigate to food_order.xml
                Intent intent = new Intent(FoodOrderActivity.this, FoodOrderFormActivity.class);
                startActivity(intent);
            }
        });
    }
}
