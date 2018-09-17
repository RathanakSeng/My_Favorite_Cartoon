/**
 * @author Rathanak
 */
package com.example.bsg.myvideo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
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

        var image = PictureManager.COLLECTION_PICTURES[PictureManager.PICTURES[picturePosition].title]
        var round: Int = 0
        forward.setOnClickListener()
        {
            when (round)
            {
                0 ->
                {
                    myImage_1.setImageResource(image!!.collection[1])
                    round = 1
                }
                1 ->
                {
                    myImage_1.setImageResource(image!!.collection[2])
                    round = 2
                }
                2 ->
                {
                    myImage_1.setImageResource(image!!.collection[3])
                    round = 3
                }
                3 ->
                {
                    myImage_1.setImageResource(image!!.collection[4])
                    round = 4
                }
                4 ->
                {
                    myImage_1.setImageResource(image!!.collection[0])
                    round = 0
                }
            }
        }
        backward.setOnClickListener()
        {
            when(round)
            {
                0 ->
                {
                    myImage_1.setImageResource(image!!.collection[4])
                    round = 4
                }
                1 ->
                {
                    myImage_1.setImageResource(image!!.collection[0])
                    round = 0
                }
                2 ->
                {
                    myImage_1.setImageResource(image!!.collection[1])
                    round = 1
                }
                3 ->
                {
                    myImage_1.setImageResource(image!!.collection[2])
                    round = 2
                }
                4 ->
                {
                    myImage_1.setImageResource(image!!.collection[3])
                    round = 3
                }
            }
        }
    }

    private fun showPicture()
    {
        myImage_1.setImageResource(PictureManager.COLLECTION_PICTURES[PictureManager.PICTURES[picturePosition].title]!!.collection[0])
    }

}
