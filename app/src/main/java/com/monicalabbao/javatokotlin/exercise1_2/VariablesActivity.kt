package com.monicalabbao.javatokotlin.exercise1_2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by Monica Labbao
 * for DroidConPH on 18/10/2018.
 * Covers:  Exercise 1: Variables and Constants
 *          Exercise 2: Null Safety
 */
class VariablesActivity : AppCompatActivity() {
    companion object {
        const val halloffamer : String = "Lebron James"
    }
    private var player : String? = null
    private lateinit var player2 : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}