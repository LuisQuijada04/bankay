package com.example.alumno.myapplication.adapters;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.alumno.myapplication.R;
import com.example.alumno.myapplication.models.Product;

import java.net.NetPermission;
import java.util.List;

public class ProducAdapter extends ArrayAdapter<Product> {
    Context Context;

    private class ViewHolder {
        TextView name;


    private ViewHolder() {
    }
}
    public ProducAdapter(Context context, List<Product> items) {
        super(context, 0, items);
        this.Context = context;
    }
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        final Product rowItem = (Product) getItem(position);
        LayoutInflater mInflater = (LayoutInflater) this.Context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.adapter_product_item, null);
            holder = new ViewHolder();
            holder.name = (TextView) convertView.findViewById(R.id.name);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.name.setText(rowItem.getName());
        return convertView;

    }
}
