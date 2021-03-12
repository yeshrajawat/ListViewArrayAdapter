package com.codingblocks.listviewarrayadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text
import java.security.AccessControlContext

class MyAdapter(val contexts:Context, var res:Int, var item:List<Model> ) : ArrayAdapter <Model> (contexts, res, item)
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
       val layoutInflater:LayoutInflater = LayoutInflater.from(contexts)
        val view:View = layoutInflater.inflate(res,null)

        val imageView :ImageView  = view.findViewById(R.id.image)
        val textview1 :TextView  = view.findViewById(R.id.text1)
        val textview2 :TextView = view.findViewById(R.id.text2)

        val mitem:Model = item[position]
        imageView.setImageDrawable(contexts.resources.getDrawable(mitem.img))
        textview1.text = mitem.english
        textview2.text = mitem.miwok

        return view
    }
}