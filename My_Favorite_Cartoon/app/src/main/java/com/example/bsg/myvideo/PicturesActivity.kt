/**
 * @author Rathanak
 */
package com.example.bsg.myvideo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_picture.*

class PicturesActivity : AppCompatActivity()
{
    private var picturePosition = DEFAULT_MAIN_IMAGE_POSITION
    var round: Int = DEFAULT_IMAGE_POSITION
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture)

        picturePosition = intent.getIntExtra("NOTE_POSITION", -1)

        if (picturePosition != -1) showPicture()

        var image = PictureManager.COLLECTION_PICTURES[PictureManager.PICTURES[picturePosition].title]
        forward.setOnClickListener()
        {
            moveNext(image)
        }
        backward.setOnClickListener()
        {
            movePrev(image)
        }
    }

    private fun movePrev(image: CollectionPictures?)
    {
	round--
        if (round == -1) round = image!!.collection.size - 1
        myImage_1.setImageResource(image!!.collection[round])
    }

    private fun moveNext(image: CollectionPictures?)
    {
	round++
        if(round == image!!.collection.size) round = 0
        myImage_1.setImageResource(image!!.collection[round])
    }

    private fun showPicture()
    {
        myImage_1.setImageResource(PictureManager.COLLECTION_PICTURES[PictureManager.PICTURES[picturePosition].title]!!.collection[DEFAULT_IMAGE_POSITION])
    }
}
