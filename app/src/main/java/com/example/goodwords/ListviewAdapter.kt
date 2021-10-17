package com.example.goodwords

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListviewAdapter(val List : MutableList<String>) : BaseAdapter(){
    override fun getCount(): Int {
        return List.size
    }

    override fun getItem(position: Int): Any {
        return List[position]
    }
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View { // xml에 하나씩 넘겨주는 놈
        var convertView = convertView
        if (convertView == null) {
            convertView = LayoutInflater.from(parent?.context).inflate(R.layout.listview_item, parent, false)
        }
        val listviewText = convertView?.findViewById<TextView>(R.id.listviewArea)
        listviewText?.text = List[position]

        return convertView!!

    }

}