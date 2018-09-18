/**
 * @author Rathanak
 */
package com.example.bsg.myvideo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(context: Context, pictures: ArrayList<Picture>) : BaseAdapter()
{
    private var myContext: Context? = null
    private var myPictures: ArrayList<Picture>

    init
    {
        myContext = context
        myPictures = pictures
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View
    {
        var inflater = LayoutInflater.from(myContext)
        var view = inflater.inflate(R.layout.customize_list_view, parent, false)

        var picture = view.findViewById<ImageView>(R.id.image)
        picture.setImageResource(myPictures[position].picture)
        var title = view.findViewById<TextView>(R.id.title)
        title.text = myPictures[position].title
        var description = view.findViewById<TextView>(R.id.description)
        description.text = myPictures[position].description

        return view
    }

    override fun getItem(position: Int): Any
    {
        return ""
    }

    override fun getItemId(position: Int): Long
    {
        return position.toLong()
    }

    override fun getCount(): Int
    {
        return myPictures.count()
    }
}