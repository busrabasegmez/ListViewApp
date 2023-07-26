package com.example.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class CustomAdapter(context: Context) : BaseAdapter() {

    private val names = arrayListOf<String>(
        "John","Steve","Tim","Denis","Mark","Jane","Juliet"
    )

    private val mContext: Context
    init {
        this.mContext = context
    }

    //responsible for how many items in my list
    override fun getCount(): Int {
        return names.size
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItem(position: Int): Any {
        return "TEST STRING"
    }

    //responsible for rendering out each row
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val layoutInflater = LayoutInflater.from(mContext)
        val rowMain = layoutInflater.inflate(R.layout.row_main ,parent, false)

        val positionTextView = rowMain.findViewById<TextView>(R.id.position_textview)
        positionTextView.text= "Row Number: $position"

        val nameText = rowMain.findViewById<TextView>(R.id.name_textview)
        nameText.text ="Name: ${names[position]}"
        //nameText.text = name.get(position)     gives also same result

        return rowMain

//        val textView1 = TextView(mContext)
//        textView1.text = "Here is my row and listview"
//        return textView1


    }


}