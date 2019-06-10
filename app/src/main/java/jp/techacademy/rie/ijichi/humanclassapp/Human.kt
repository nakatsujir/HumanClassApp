package jp.techacademy.rie.ijichi.humanclassapp

import android.util.Log

var hobby: String = "未来"

open class Human : Animal, Thinkable {

    constructor(name: String, age: Int) : super(name, age){
        this.name= name
        this.age = age

    }

    override fun say() {
        Log.d("kotlinTest", "私の名前は" + name + "です。" + "年は" + age + "歳です。")
    }

    override fun think() {
        Log.d("kotlinTest", "私は" + hobby + "について考える。")

    }

}