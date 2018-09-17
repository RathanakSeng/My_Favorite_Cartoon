package com.example.bsg.myvideo

data class Picture(var picture: Int, var title: String, var description: String)
{
    override fun toString(): String
    {
        return title
    }
}

data class CollectionPictures(var collection: ArrayList<Int>)