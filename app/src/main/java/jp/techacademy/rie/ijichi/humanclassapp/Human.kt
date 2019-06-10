package jp.techacademy.rie.ijichi.humanclassapp

import android.util.Log


open class Human : Animal, Thinkable {

    var hobby: String

    constructor(name: String, age: Int, hobby: String) : super(name, age) {
        this.name = name
        this.age = age
        this.hobby = hobby

    }

    override fun say() {
        Log.d("kotlinTest", "私の名前は" + name + "です。" + "年は" + age + "歳です。")
    }

    override fun think() {
        Log.d("kotlinTest", "私は" + hobby + "について考える。")

    }

}