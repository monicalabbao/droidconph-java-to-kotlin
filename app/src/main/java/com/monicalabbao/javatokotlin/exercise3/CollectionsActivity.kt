package com.monicalabbao.javatokotlin.exercise3

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by Monica Labbao
 * for DroidConPH on 18/10/2018.
 * Covers: Exercise 3: Collections
 */
class CollectionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var songs = listOf<String>("La chansonette", "A bicyclette", "Barbara")
        var singers = arrayOf("Sergey Trofimov", "Javier Solis", "Yves Montand")
        var bands = arrayListOf("Lubeh", "Parokya ni Edgar", "Dapulis")
    }
}