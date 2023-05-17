package com.example.musicalization

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Music : RealmObject(){
    @PrimaryKey
    var id : Int = 0
    var title : String = ""
    var musicPath : String = ""
    var autoSound : Int = 40
    var lyrics : String = ""
    var pictureBitmapByte : ByteArray = byteArrayOf()
}

open class MusicList : RealmObject(){
    @PrimaryKey
    var id : Int = 0
    var title : String = ""
    var musicList : String = "" //format -> {TITLE1,TITLE2,TITLE3}
}