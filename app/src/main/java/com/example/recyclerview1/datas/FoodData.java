package com.example.recyclerview1.datas;

import com.example.recyclerview1.R;
import com.example.recyclerview1.models.Food;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FoodData {
    private static String [] foodName = {
            "Harley",
            "GL",
            "Vario",
            "Nmax",
            "R15",
            "Beat",
    };

    private static String [] foodPrice = {
            "2000000",
            "5000000",
            "1000000",
            "2000000",
            "5000000",
            "10000000"
    };

    private static int [] foodImage = {
            R.drawable.harley,
            R.drawable.gl,
            R.drawable.vario,
            R.drawable.nmax,
            R.drawable.r15,
            R.drawable.beat,
    };

    public static ArrayList<Food> getDataFood() {
        ArrayList<Food> list = new ArrayList<>();
        for(int i=0;i<foodName.length;i++){
            Food food = new Food(foodName[i],"Rp " + foodPrice[i], foodImage[i]);
            list.add(food);
        }
        return list;
    }
}
