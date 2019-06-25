package com.ngopidev.project.androidlatihan7_kotlinfirst

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.*
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , View.OnClickListener {
    override fun onClick(p0: View?) {

    }

    //deklarasi variable
    var a = "Contoh" //secara default di deklarasi sebagai String
    var aa : String = "contoh"
    lateinit var aaa : String

    val b = "Contoh"
    val bb : String = "Contoh"
    val bbb : String = ""

    val nilai = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = """
            #data pertama
            #data kedua
            #data ketiga
        """.trimMargin("#")

        Log.d("TAG_SAMPLE", text)

        for(a : Int in 1..10){ //dalam java => for(int a = 1; a <= 10; a++)
//            Log.d("TAG_SAMPLE", "a = "+a)
            d("TAG_SAMPLE", "a = "+a)
            e("TAG_SAMPLE", "a = " +a)
            i("TAG_SAMPLE", "a = "+a)
        }

        val tv_hello : TextView = findViewById(R.id.tv_hello)
        tv_hello.text = "Assalamualaykum" // sama seperti tv_hello.setText("Assalamualaykum")
        tv_hello.text // sama seperti tv_hello.getText()

        tv_nama.text = "Siapa Nama Kalian" // tv_nama langsung ngambil dari id yg ada
        Konstanta.setnamaVariable("Namanya Siapa")
        tv_nama.text = Konstanta.getnamaVariable()

        Konstanta.setterGetterBeda = "Rifky"
        tv_nama.text = Konstanta.setterGetterBeda

        //memberikan method onclick pada tv_nama
        tv_nama.setOnClickListener {
            Toast.makeText(this, "Hello ${tv_nama.text}" // sama seperti "Hello "+tv_nama.getText() dalam java
                , Toast.LENGTH_SHORT).show()
        }

        btn_oke.setOnClickListener {
            val angka : Int = et_angka.text.toString().toInt()

when(angka){
    0 -> Toast.makeText(this, "Angka 0", Toast.LENGTH_SHORT).show()
    1, 2, 3 -> Toast.makeText(this, "Angka  1 - 3", Toast.LENGTH_SHORT).show()
    else -> Toast.makeText(this, "Angka lebih dari 3", Toast.LENGTH_SHORT).show()
}

        }
    }
}
