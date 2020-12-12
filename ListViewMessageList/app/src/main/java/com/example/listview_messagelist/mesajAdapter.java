package com.example.listview_messagelist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class mesajAdapter extends BaseAdapter {
    //BaseAdapter işlemin de aşağıdaki methodları eklemek zorundayız
    //

    List<mesajModel> liste;
    Context contex;

    public mesajAdapter(List<mesajModel> liste, Context contex) {
        this.liste = liste;
        this.contex = contex;
    }

    @Override
    public int getCount() {
        //liste uzunluğu
        return liste.size();
    }

    @Override
    public Object getItem(int position) {
        return liste.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //view elemanlarını tanımlıyoruz
        View layout = LayoutInflater.from(contex).inflate(R.layout.layout,parent,false);
        //layout.xml de içeriğinde ne var onları alıyoruz
        ImageView img = layout.findViewById(R.id.kisiResim);
        TextView text = layout.findViewById(R.id.kisiIsmi);
        TextView mesaj = layout.findViewById(R.id.mesaj);

        //üsteki değerlere id değerleri ile ulaştıktan sonra
        //listedeki değerleri giriyoruz
        img.setImageResource(liste.get(position).getResimId());
        text.setText(liste.get(position).getKisi());
        mesaj.setText(liste.get(position).getMesajIcaerik());



        return layout;
    }
}
