/**
 * @author Rathanak
 */
package com.example.bsg.myvideo

object PictureManager
{
    val PICTURES: ArrayList<Picture> = arrayListOf()
    val COLLECTION_PICTURES: HashMap<String, CollectionPictures> = hashMapOf()

    init
    {
        initializePictures()
        initializeCollectionPictures()
    }

    private fun initializeCollectionPictures()
    {
        var myCollection: ArrayList<ArrayList<Int>> = arrayListOf(

                arrayListOf<Int>(
                        R.drawable.oggy,
                        R.drawable.jack,
                        R.drawable.joey,
                        R.drawable.marky,
                        R.drawable.deedee
                ),
                arrayListOf<Int>(
                        R.drawable.tom,
                        R.drawable.tom_1,
                        R.drawable.tom_2,
                        R.drawable.tom_3,
                        R.drawable.tom_4
                ),
                arrayListOf<Int>(
                        R.drawable.pink,
                        R.drawable.pink_1,
                        R.drawable.pink_2,
                        R.drawable.pink_3,
                        R.drawable.pink_4
                ),
                arrayListOf<Int>(
                        R.drawable.hap,
                        R.drawable.hap_1,
                        R.drawable.hap_2,
                        R.drawable.hap_3,
                        R.drawable.hap_4
                ),
                arrayListOf<Int>(
                        R.drawable.pop,
                        R.drawable.pop_1,
                        R.drawable.pop_2,
                        R.drawable.pop_3,
                        R.drawable.pop_4
                )
        )

        for (position in 0 until PICTURES.size)
        {
            COLLECTION_PICTURES[PICTURES[position].title] = CollectionPictures(myCollection[position])
        }

    }

    private fun initializePictures()
    {
        var myPictures = arrayListOf<Picture>(

                Picture(R.drawable.oggy, "Oggy and the Cockroaches", "Crazy stupid cat vas 3 savage cockroaches"),
                Picture(R.drawable.tom, "Tom and Jerry", "Cat vs Dog, Fighting friendship"),
                Picture(R.drawable.pink, "Pink panther", "Ready for the pink tiger?? op!! no, Pink panther"),
                Picture(R.drawable.hap, "Happy Tree", "Scray cartoon, unique but awesome. Don't get scare of it hahahahah"),
                Picture(R.drawable.pop, "Power pop girl", "Oh my superhero!!! I love you so much...jub jub")
        )
        for (element in myPictures) PICTURES.add(element)
    }
}
