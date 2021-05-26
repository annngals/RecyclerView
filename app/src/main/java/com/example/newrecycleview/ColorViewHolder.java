package com.example.newrecycleview;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ColorViewHolder extends RecyclerView.ViewHolder {
    TextView tv;
    Context context;

    public ColorViewHolder(@NonNull View itemView) {
        super(itemView);
        tv = itemView.findViewById(R.id.color);
        context = itemView.getContext();
        // создать объекты интерфейса и
        // повешать обработчики событий

    }

    void bindTo(String color) {
        // заполнить объекты интерфейса значениями (данными)
        // TODO: задать цвет у текстового поля
        // TODO: написать название цвета в текстовом поле

        Resources resources = context.getResources();
        int id = resources.getIdentifier(color, "color", context.getPackageName());
        Log.d("mytag", "id: " + id + " color: " + color);
        tv.setBackgroundColor(resources.getColor(id));
        tv.setText("color:" + color);
    }

}