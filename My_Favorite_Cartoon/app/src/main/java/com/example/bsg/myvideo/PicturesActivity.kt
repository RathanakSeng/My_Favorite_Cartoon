package com.example.bsg.myvideo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import kotlinx.android.synthetic.main.activity_picture.*

class PicturesActivity : AppCompatActivity()
{
    private var picturePosition = -1
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture)

        picturePosition = intent.getIntExtra("NOTE_POSITION", -1)

        if (picturePosition != -1) showPicture()

        forward.setOnClickListener()
        {
            when
            {
                pic_1.visibility == View.VISIBLE -> changeImage(pic_2)
                pic_2.visibility == View.VISIBLE -> changeImage(pic_3)
                pic_3.visibility == View.VISIBLE -> changeImage(pic_4)
                pic_4.visibility == View.VISIBLE -> changeImage(pic_5)
                pic_5.visibility == View.VISIBLE -> changeImage(pic_1)
            }
        }
        backward.setOnClickListener()
        {
            when
            {
                pic_1.visibility == View.VISIBLE -> changeImage(pic_5)
                pic_2.visibility == View.VISIBLE -> changeImage(pic_1)
                pic_3.visibility == View.VISIBLE -> changeImage(pic_2)
                pic_4.visibility == View.VISIBLE -> changeImage(pic_3)
                pic_5.visibility == View.VISIBLE -> changeImage(pic_4)
            }
        }
    }

    private fun changeImage(view: FrameLayout?)
    {
        when (view)
        {
            pic_1 ->
            {
                pic_2.visibility = View.GONE
                pic_3.visibility = View.GONE
                pic_4.visibility = View.GONE
                pic_5.visibility = View.GONE
                pic_1.visibility = View.VISIBLE
            }
            pic_2 ->
            {
                pic_1.visibility = View.GONE
                pic_3.visibility = View.GONE
                pic_4.visibility = View.GONE
                pic_5.visibility = View.GONE
                pic_2.visibility = View.VISIBLE
            }
            pic_3 ->
            {
                pic_1.visibility = View.GONE
                pic_2.visibility = View.GONE
                pic_4.visibility = View.GONE
                pic_5.visibility = View.GONE
                pic_3.visibility = View.VISIBLE
            }
            pic_4 ->
            {
                pic_1.visibility = View.GONE
                pic_2.visibility = View.GONE
                pic_3.visibility = View.GONE
                pic_5.visibility = View.GONE
                pic_4.visibility = View.VISIBLE
            }
            pic_5 ->
            {
                pic_1.visibility = View.GONE
                pic_2.visibility = View.GONE
                pic_3.visibility = View.GONE
                pic_4.visibility = View.GONE
                pic_5.visibility = View.VISIBLE
            }
        }
    }

    private fun showPicture()
    {
        var image = PictureManager.COLLECTION_PICTURES[PictureManager.PICTURES[picturePosition].title]
        myImage_1.setImageResource(image!!.collection[0])
        myImage_2.setImageResource(image.collection[1])
        myImage_3.setImageResource(image.collection[2])
        myImage_4.setImageResource(image.collection[3])
        myImage_5.setImageResource(image.collection[4])
    }

}
