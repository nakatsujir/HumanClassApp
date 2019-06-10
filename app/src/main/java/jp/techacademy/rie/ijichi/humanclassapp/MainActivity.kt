package jp.techacademy.rie.ijichi.humanclassapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val taro = Human("たろう", 17, "未来")
        taro.say()
        taro.think()
        val hana = Human("はな", 18, "夢")
        hana.say()
        hana.think()

    }
}
