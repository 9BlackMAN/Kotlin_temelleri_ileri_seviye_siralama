package com.ckc.kotlin_temeller_leriseviye

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private var int : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //let

        //null kontrolünü if yerine bunun ile daha basit

       val a= int?.let {

           val a = 50 + it
        } ?: 5  //bu gösterim eğer null ise 5 sonucunu verir

        println(a)


        val ali = person("ali",5)
        val murat = person("murat",8)
        val ayse = person("ayse",4)

        val data = listOf<person>(ali,murat,ayse)

        data.filter {it.age<6 }.also { for (person in it){ println(person.name)} }

        //Applay

        val intent = intent
        intent.putExtra("","")
        intent.`package` = ""
        intent.action = ""


        val intentWith =Intent().apply {
            intent.putExtra("","")
            intent.`package` = ""
            intent.action = ""
        }


        //with vs apply

        person("jale",4).apply {
            name = "Jale"
        }.also {
            println(it.name)
        }






    }
}
data class person(var name:String,var age : Int)





























