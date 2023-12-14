package com.example.foodorderapp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class FoodItemActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_item);

        Button orderButton = findViewById(R.id.orderButton);
        orderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(FoodItemActivity.this, "Order has been made!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(FoodItemActivity.this, FoodOrderActivity.class);
                startActivity(intent);
            }
        });
    }
}
