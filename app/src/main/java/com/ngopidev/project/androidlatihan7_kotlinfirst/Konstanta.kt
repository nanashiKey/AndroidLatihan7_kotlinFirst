package com.ngopidev.project.androidlatihan7_kotlinfirst


/**
 *   created by Irfan Assidiq on 2019-06-11
 *   email : assidiq.irfan@gmail.com
 **/
class Konstanta {
            //deklarasi dalam java :
            //final String namaVariable = "contoh variable"
    companion object {
        var namaVariable = "Contoh Variable"
        val contohAngka = 100

        //membuat method dalam kotlin:
        //public void namaMethod(){ isi methodnya apa} => ini dalam java

        fun setnamaVariable(namaVariable : String){
            this.namaVariable = namaVariable
        }
        fun getnamaVariable() : String{ // public String getnamaVariable(){return namaVariable;}
            return namaVariable
        }

        //setter getter cara kotlin
        var setterGetterBeda = ""
        get() = field
        set(value) {
            field = value
        }

    }
}