package com.example.pizzarecipes.adapter;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pizzarecipes.R;
import com.example.pizzarecipes.classes.Produit;

import java.util.List;

public class ProduitAdapter extends BaseAdapter {

    private List<Produit> produits;
    private LayoutInflater inflater;
public ProduitAdapter(List<Produit> produits, Activity activity){
    this.produits=produits;
    this.inflater=(LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
}
@Override
    public int getCount(){
    return produits.size();
}

@Override
    public Object getItem(int position){
    return produits.get( position);
}
@Override
    public long getItemId(int position){
         return position;
}
@Override
    public View getView(int position, View convertView, ViewGroup parent){
    if (convertView == null) {
        convertView = inflater.inflate(R.layout.item, null); // Vérifie que item.xml existe dans res/layout
    }
    ImageView photoPizza=convertView.findViewById(R.id.photoPizza);
    ImageView suivant=convertView.findViewById(R.id.suivant);
    ImageView alarm=convertView.findViewById(R.id.alarm);
    TextView nomPizza=convertView.findViewById(R.id.nomPizza);
    TextView duree=convertView.findViewById(R.id.duree);
    TextView nbrIngrediant=convertView.findViewById(R.id.nbrIngredient);
    photoPizza.setImageResource(produits.get(position).getPhoto());
    nomPizza.setText(String.valueOf(produits.get(position).getNom()));
    duree.setText(String.valueOf(produits.get(position).getDuree()));
    nbrIngrediant.setText(String.valueOf(produits.get(position).getNbrIngredients()));
    return convertView;

}

}
