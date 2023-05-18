package com.example.musicalization

import android.os.Environment
import java.io.File

class FetchFileClass {
    companion object{
        val DL_DIR = Environment
            .getExternalStoragePublicDirectory(
                Environment.DIRECTORY_DOWNLOADS
            )
            .path
    }

    fun getFileToList() : MutableList<String>?{
        val resultList : MutableList<String> = mutableListOf()

        val fileList =  File(DL_DIR).list() ?: return null
        val fileQuantity = fileList.size

        for(i in 0 until fileQuantity){
            if(!fileList[i].endsWith(".mp3")) continue
            resultList.add(i,fileList[i])
        }

        return resultList
    }

    fun getUri(){

    }
}