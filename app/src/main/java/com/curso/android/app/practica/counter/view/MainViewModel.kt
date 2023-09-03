package com.curso.android.app.practica.counter.view

import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {



    fun compararTextos(texto1: String, texto2: String): String {
        return if (texto1 == texto2) {
            "¡¡ :) SON SIMILARES !! "
        } else {
            "¡¡ :( SON DIFERENTES !!"
        }
    }



}
