package com.example.pizzarecipes;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ItemDetailActivity extends AppCompatActivity {
    private ImageView image;
    private TextView nomPizzaItem;
    private TextView descriptionItem;
    private TextView ingredientsItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);
        image=findViewById(R.id.image);
        nomPizzaItem=findViewById(R.id.nomPizzaItem);
        descriptionItem=findViewById(R.id.descriptionItem);
        ingredientsItem=findViewById(R.id.ingredientsItem);
        Intent intent = getIntent();
        nomPizzaItem.setText(intent.getStringExtra("nomPizzaItem"));
        descriptionItem.setText(intent.getStringExtra("descriptionItem"));
        ingredientsItem.setText(intent.getStringExtra("ingredientsItem"));
        image.setImageResource(intent.getIntExtra("image", R.mipmap.icon));



    }
}