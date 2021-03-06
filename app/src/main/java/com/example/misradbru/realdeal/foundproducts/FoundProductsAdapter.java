package com.example.misradbru.realdeal.foundproducts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.misradbru.realdeal.R;
import com.example.misradbru.realdeal.data.FoundProduct;

import java.util.List;

public class FoundProductsAdapter  extends ArrayAdapter<FoundProduct> {

    FoundProductsAdapter(Context context, List<FoundProduct> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.layout_foundproductitem, parent, false);

        }

        TextView titleTextView = convertView.findViewById(R.id.found_product_name_tv);
        TextView providerTextView = convertView.findViewById(R.id.found_product_provider_tv);
        TextView priceTextView = convertView.findViewById(R.id.price_tv);
        FoundProduct product = getItem(position);
        titleTextView.setText(product.getName());
        String price = product.getPrice() + " " + product.getCurrency();
        providerTextView.setText(product.getProvider());
        priceTextView.setText(price);

        return convertView;
    }

}