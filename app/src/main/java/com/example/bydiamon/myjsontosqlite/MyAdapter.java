package com.example.bydiamon.myjsontosqlite;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by ByDiamon on 11/6/2560.
 */

public class MyAdapter extends BaseAdapter{
    private Context objcontext;
    private String[] numberbus , busstop;
    private int [] gx , gy;


    public  MyAdapter(Context context , String[] bus , String[] namebusstop , int [] gpsx , int[] gpsy){
        this.objcontext=context;
        this.numberbus=bus;
        this.busstop=namebusstop;
        this.gx=gpsx;
        this.gy=gpsy;
    }

    @Override
    public int getCount() {
        return numberbus.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater objLayoutInflater = (LayoutInflater)objcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = objLayoutInflater.inflate(R.layout.list_view_row,parent,false);

        //Setup Text bus
        TextView listViewbus = (TextView)view.findViewById(R.id.textView1);
        listViewbus.setText(numberbus[position]);
        return null;
    }
}
