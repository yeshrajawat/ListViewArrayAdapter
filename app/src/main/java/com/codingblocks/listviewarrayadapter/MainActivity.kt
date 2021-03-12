package com.codingblocks.listviewarrayadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview :ListView = findViewById(R.id.list)
        val listofitems = ArrayList<Model>()
        listofitems.add(Model("Facebook","facebook",R.drawable.facebook))
        listofitems.add(Model("Linkedin","linkedin",R.drawable.linkedin))
        listofitems.add(Model("Google","Google",R.drawable.googleplus))
        listofitems.add(Model("Skills","skills",R.drawable.skills))
        listofitems.add(Model("Facebook","facebook",R.drawable.facebook))
        listofitems.add(Model("Linkedin","linkedin",R.drawable.linkedin))
        listofitems.add(Model("Google","Google",R.drawable.googleplus))
        listofitems.add(Model("Skills","skills",R.drawable.skills))
        listofitems.add(Model("Facebook","facebook",R.drawable.facebook))
        listofitems.add(Model("Linkedin","linkedin",R.drawable.linkedin))
        listofitems.add(Model("Google","Google",R.drawable.googleplus))
        listofitems.add(Model("Skills","skills",R.drawable.skills))

        val adapter= MyAdapter(this,R.layout.listsview,listofitems)
        listview.adapter = adapter
    }
}