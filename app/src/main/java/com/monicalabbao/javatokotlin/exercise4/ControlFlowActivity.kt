package com.monicalabbao.javatokotlin.exercise4

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by Monica Labbao
 * for DroidConPH on 18/10/2018.
 * Exercise # 4: Demonstrating Control Flow in Kotlin
 */
class ControlFlowActivity : AppCompatActivity() {
    //TODO: Select Divine Office Version
    //TODO: Make exercise identifying the selection of different flowers
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ifStatement()
        whenStatement("Hannah Tuazon")
    }

    private fun ifStatement() {
        var isTrad = false
        if (isTrad) {

        }
    }

    /**Returns true if person has attended TLM. False otherwise*/
    private fun whenStatement(name : String) : Boolean {
        when(name) {
            "Paolo Gonzales" -> {
                return true
            }
            "Earl Adrian Hans" -> {
                return true
            }
            "Carl Puray" -> {
                return false
            }
            "Hannah Tuazon" -> {
                return false
            }
        }
        return false
    }
}