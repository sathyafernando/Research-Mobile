package com.example.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView

class NoteListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_list)
        var listNode =   (findViewById(R.id.listeNode) as ListView)
        listNode.adapter = MyCustomeAtapter(this)
    }

}

private class MyCustomeAtapter (context: Context): BaseAdapter()
{
    private val mContext: Context
    private val names = arrayListOf<String>(
        "kuku","pukuu","fdg","rtret"
    )
    init {
        mContext=context
    }
    override fun getCount(): Int {
      return  names.size ;
    }

    override fun getItemId(position: Int): Long {
        return  position.toLong()
    }

    override fun getItem(position: Int): Any {
       return  "TEST STRING"
    }

    override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?): View {
      var layoutInflater = LayoutInflater.from((mContext))
       var rowMain =  layoutInflater.inflate(R.layout.row_main,viewGroup,false)
        var mainTextView = rowMain.findViewById<TextView>(R.id.main_textview)
        mainTextView.text= names.get(position)

       var positionTextView = rowMain.findViewById<TextView>(R.id.possition_textview)
        positionTextView.text= "puku : $position"
      //val textView =  TextView(mContext)
      //  textView.text= "ewqewqe"

        return rowMain
    }
}