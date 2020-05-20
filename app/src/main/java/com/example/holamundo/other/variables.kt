package com.example.holamundo.other

import android.util.Log


/*
En Kotlin todo es un objeto     
No hay tipos basicos de variables y no existe el void
Si algo no devuelve nada este esta devolviendo Unit Objet
las varibales pueden ser mutable y otras inmutables,usaremos inmutables siempre que se posibles
(var es para mutables y val es para inmutables)
Los tipos son definidos despues del nombre de la variable con dos puntos y espacio (val nombre: tipo de dato)
* */

class variables{

    private var variable0: Int = 1
    private var variable1 = 1.toByte()
    private var variable2 = -123
    private var variable3 = 23242523234
    private var variable4 = 1.1.toFloat()
    private var variable5 = 1.9
    private var variable6 = 'a'
    private var variable7 = "As"
    private var variable8 = true
    private var variable9 = arrayOf(1,2,3,4,5)
    private var variable10 = arrayOfNulls<Int>(10)
    private val variable11 = "esta variavle es solo lectura/inmutable/constante"

    private fun showcase() {
        Log.w("variable0", "Es variable cero un integer"+(variable0 is Int) +
        "por que no es un byte?")
        Log.w("variable0", "Es variable uno un byte"+(variable1 is Byte) +
                "por que no es un byte?")

        Log.w("variable2", "Es valor Integer")
        variable2 = Int.MAX_VALUE

        Log.w("variable0", "Es valor Long" +(variable3 is Long) )

        Log.w("variable4", "Es valor Float" +(variable4 is Float) )
        Log.w("variable5", "Es valor Double" +(variable5 is Double) )

        Log.w("variable6", "Es valor Char" +(variable6 is Char) )
        Log.w("variable7", "Es valor String" +(variable7 is String) )

        //String literals
        variable7 = "!HOLA MUNDO!\n !ADIOS MUNDO" // ESTILO JAVA
        variable7 = """
                    !HOLA MUNDO!
                    !ADIOS MUNDO"
        """.trimIndent() // ESTILO KOTLIN  DE MARAVILLA
        //String Templates


        Log.w("variable8", "Es valor Boolean " +(variable8 is Boolean) )

        Log.w("variable9", "Es valor Array<Int>" +(variable9 is Array<Int>) )

        //variable11 = "" esta asignacion genera Error master2345

    }

}