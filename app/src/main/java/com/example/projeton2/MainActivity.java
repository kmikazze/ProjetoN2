package com.example.projeton2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.projeton2.adapter.FoodAdapter;
import com.example.projeton2.databinding.ActivityMainBinding;
import com.example.projeton2.model.Food;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private FoodAdapter foodAdapter;
    private ArrayList<Food> foodList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        RecyclerView recyclerViewFood = binding.RecycleViewFood;
        recyclerViewFood.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewFood.setHasFixedSize(true);
        foodAdapter = new FoodAdapter(foodList,this);
        recyclerViewFood.setAdapter(foodAdapter);
        getFood();
    }

    private void getFood(){

        Food food1 = new Food(
                R.drawable.food1,
                "PORÇÕES",
                "Porções P, M e g, para todo tipo de fome!",
                "R$ 89,90"
        );
        foodList.add(food1);

        Food food2 = new Food(
                R.drawable.food2,
                "PORÇÕES",
                "Porções P, M e g, para todo tipo de fome!",
                "R$ 89,90"
        );
        foodList.add(food2);

        Food food3 = new Food(
                R.drawable.food3,
                "PORÇÕES",
                "Porções P, M e g, para todo tipo de fome!",
                "R$ 89,90"
        );
        foodList.add(food3);

        Food food4 = new Food(
                R.drawable.food4,
                "PORÇÕES",
                "Porções P, M e g, para todo tipo de fome!",
                "R$ 89,90"
        );
        foodList.add(food4);

        Food food5 = new Food(
                R.drawable.food5,
                "PORÇÕES",
                "Porções P, M e g, para todo tipo de fome!",
                "R$ 89,90"
        );
        foodList.add(food5);
    }
}