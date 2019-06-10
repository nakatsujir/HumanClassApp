package jp.techacademy.rie.ijichi.humanclassapp

import android.util.Log

abstract class Animal {
    var name:String
    var age:Int

    constructor(name:String,age:Int){
        this.name = name
        this.age = age
    }

    open fun say(){
    }

}